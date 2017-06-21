package com.datapump;

import com.lmax.disruptor.EventFactory;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/**
 * Created by kaideng on 17-6-17.
 */
public class ExeTask   implements   LifecycleAware,Configurable,Task
{





    Disruptor<Event> disruptor;

    Context   context;

    LifecycleState   state;

    int  bufferSize = 1024;


    Executor   executor;

    EventHandler<Event>[] consumers;

    String   shell;


    String   command;


    EventFactory<Event> eventFactory = new  EventFactory()
    {
        public Object newInstance() {
            return new Event();
        }
    } ;


    public void start() {

        Executor executor = Executors.newCachedThreadPool();

        int bufferSize = 16;

        Disruptor<Event> disruptor = new Disruptor<Event>(eventFactory, bufferSize, executor);

        // Connect the handler
        disruptor.handleEventsWith(consumers);

        // Start the Disruptor, starts all threads running
        disruptor.start();



        ExecRunnable   execRunnable =  new ExecRunnable( shell,  command, Charset.defaultCharset(),disruptor.getRingBuffer());

        executor.execute(execRunnable);


    }

    public void stop() {

    }

    public LifecycleState getLifecycleState() {
        return null;
    }

    public void configure(Context context) {


        Integer    consumerThreadNum = context.getInteger("consumer.threads.num");

        String     consumerType =  context.getString("consumer.type");
        consumers  = new   EmptyConsumer[consumerThreadNum];

        for (int i=0;i<consumerThreadNum;i++)
        {
            consumers[i] = new   EmptyConsumer();
        }
        this.shell = context.getString("execute.shell");
        this.command = context.getString("execute.command");


    }
    private static String[] formulateShellCommand(String shell, String command) {
        String[] shellArgs = shell.split("\\s+");
        String[] result = new String[shellArgs.length + 1];
        System.arraycopy(shellArgs, 0, result, 0, shellArgs.length);
        result[shellArgs.length] = command;
        return result;
    }


    private static class ExecRunnable implements Runnable {

        public ExecRunnable(String shell, String command,

                            Charset charset,RingBuffer<Event>  ringBuffer) {
            this.command = command;
            this.charset = charset;
            this.shell = shell;
            this.ringBuffer =  ringBuffer;
        }

        private final String shell;
        private final String command;


        private final Charset charset;
        private Process process = null;
        private final RingBuffer<Event> ringBuffer ;




        public void run() {
            do {
                String exitCode = "unknown";
                BufferedReader reader = null;
                String line = null;



                try {
                    if (shell != null) {
                        String[] commandArgs = formulateShellCommand(shell, command);
                        process = Runtime.getRuntime().exec(commandArgs);
                    } else {
                        String[] commandArgs = command.split("\\s+");
                        process = new ProcessBuilder(commandArgs).start();
                    }
                    reader = new BufferedReader(
                            new InputStreamReader(process.getInputStream(), charset));


                    while ((line = reader.readLine()) != null) {
                        System.err.println("prepare");
                        long sequence = ringBuffer.next();

                       System.err.println("sequence: " + sequence);// Grab the next sequence
                        try {
                            Event event = ringBuffer.get(sequence); // Get the entry in the Disruptor
                            // for the sequence

                            System.err.println("prepare1");


                            event.setValue(line);  // Fill with data
                        } finally {
                            ringBuffer.publish(sequence);
                        }

                    }

                    System.err.println("over  ");
                    break;

                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.err.println("***************");


            } while (true);
        }
    }


    public  static  void main(String[]  args)
    {
        Context  context = new  Context();
        context.put("consumer.threads.num","1");
        context.put("execute.command","tail  -n +10  /home/kaideng/datapump/pom.xml");
        ExeTask   exeTask = new  ExeTask();

        exeTask.configure(context);

        exeTask.start();




    }
}
