package org.Executor_Framework_Java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleExecutor {
    public static void main(String[] args) {

        //creating an obj of executor service with fixed thread pool 2
        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int i=0; i<5; i++){
            //creating instance of the Task1 class and pass a value to its constructor
            Runnable task = new Task1("Running..."+i);
            executorService.execute(task);//task using execute() method
            executorService.shutdown();//closing executor
            while (!executorService.isTerminated()){

            }
            System.out.println("Finished all thread");
        }
    }
}
