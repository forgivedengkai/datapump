package com.datapump;


import com.lmax.disruptor.EventHandler;

/**
 * Created by kaideng on 17-6-17.
 */
public class EmptyConsumer extends  AbstractConsumer  {

    private  int  seq;

    public  EmptyConsumer(){}


    public   EmptyConsumer(int   seq)
    {
            this.seq=seq;
    }


    public void onEvent(Event event, long l, boolean b) throws Exception {
        System.err.println("consumer : "+event.getValue())d;
    }
}
