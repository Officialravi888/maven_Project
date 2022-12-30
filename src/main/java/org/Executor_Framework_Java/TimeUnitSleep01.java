package org.Executor_Framework_Java;

import java.util.concurrent.TimeUnit;

public class TimeUnitSleep01 {
    public static void main(String[] args) {
        long timeToSleep=0L;
        TimeUnit timeUnit=TimeUnit.SECONDS;
        try{
            System.out.println("sleep 2"+timeToSleep+"Seconds");
            timeUnit.sleep(timeToSleep);
            System.out.println("Sleep"+timeToSleep+"seconds");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
