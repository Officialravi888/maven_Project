package org.Executor_Framework_Java;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandlerDemoo implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable runnableObject, ThreadPoolExecutor executorObjet) {
        System.out.println(runnableObject.toString()+"is rejected");
    }
}
