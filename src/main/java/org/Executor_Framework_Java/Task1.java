package org.Executor_Framework_Java;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Task1 implements Runnable{
    private  String threadNo;//initialize threadNo variable
    public Task1(String no){//use constructor
        this.threadNo=no;
    }
    @Override
    public void run() {//using the run method
        System.out.println(Thread.currentThread().getName()+"start execution.ThreadNo="+threadNo);
        System.out.println(Thread.currentThread().getName()+"stop execution,");
    }
    private void processThread(){//create in a method
        try{
        Thread.sleep(500000);
    }catch(InterruptedException e){
            e.printStackTrace();
        }
}
public String toString(){
    return this.threadNo;
}

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService= Executors.newScheduledThreadPool(1);
       // Task1 A1 = new Task1("Ravi");

    }
}
