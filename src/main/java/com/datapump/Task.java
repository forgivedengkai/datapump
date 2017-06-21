package com.datapump;

/**
 * Created by kaideng on 17-6-18.
 */
public interface Task extends LifecycleAware {

    public  String  getTaskId();

    public  boolean  checkBefore();

    public  boolean  checkAfter();
}
