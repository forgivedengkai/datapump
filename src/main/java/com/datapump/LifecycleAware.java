package com.datapump;

public interface LifecycleAware {


  public void start();

  public void stop();


  public LifecycleState getLifecycleState();

}
