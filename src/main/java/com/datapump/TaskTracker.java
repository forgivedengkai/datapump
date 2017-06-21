package com.datapump;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by kaideng on 17-6-18.
 */
public class TaskTracker implements   LifecycleAware{
    /**
     * 用于存放该节点上运行的所有任务,任务配置放入Task中
     */
    ConcurrentHashMap<String,Task>    taskMap;


    public  boolean   addTask(Task   task,String taskId)
    {
        Task   taskPre = this.taskMap.putIfAbsent(task.getTaskId(),task);

        if(taskPre != null)
        {

        }
        return  true;
    }

    /**
     * 运行前检查
     * @return
     */
    public  boolean   checkTaskBefore(Task   task)
    {

        return   task.checkBefore();

    }


    public  boolean  stopTask(String  taskId)
    {
        Task  task = this.taskMap.get(taskId);
        /**
         * 关闭逻辑放在task中
         */
        task.stop();

    }


    public TaskTracker() {
        taskMap = new ConcurrentHashMap();
    }


    public void start() {

    }

    public void stop() {

    }

    public LifecycleState getLifecycleState() {
        return null;
    }
}
