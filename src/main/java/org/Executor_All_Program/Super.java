package org.Executor_All_Program;

public class Super {
    public Super(){
        new Thread(){
            @Override
            public void run() {
                System.out.println(Super.this.toString());
            }
        }.start();
    }
}
