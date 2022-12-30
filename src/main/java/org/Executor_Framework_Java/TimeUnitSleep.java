package org.Executor_Framework_Java;

import java.util.concurrent.TimeUnit;

public class TimeUnitSleep {
    public static void main(String[] args) {
        long timeToSleep=15L;
        TimeUnit timeUnit=TimeUnit.SECONDS;
        try{
            System.out.println("Gooing to sleep"+timeToSleep+"Seconds");
            timeUnit.sleep(timeToSleep);
            System.out.println("Sleep"+timeToSleep+"seconds");
        }catch (InterruptedException e){
            System.out.println("These is throw interrupction"+e);
        }
    }
}
