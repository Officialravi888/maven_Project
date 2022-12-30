package org.Executor_Framework_Java;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpro03 {
    public static void main(String[] args) {
        CountDownLatch CountDownLatch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println("Starting");
        executorService.execute(new ThreadPro02(CountDownLatch, "A"));
        try {
            CountDownLatch.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        executorService.shutdown();
        System.out.println("Done");
    }
}
