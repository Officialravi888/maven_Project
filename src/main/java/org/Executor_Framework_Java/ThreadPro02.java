package org.Executor_Framework_Java;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPro02 implements Runnable {
    String name;
    CountDownLatch latch;

    public ThreadPro02(CountDownLatch countDownLatch, String a) {

    }

    void Threadpro02(CountDownLatch latch, String name){
        this.name=name;
        this.latch=latch;
        new Thread(this);
    }
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(name+":"+i);
            latch.countDown();
        }
    }
}
