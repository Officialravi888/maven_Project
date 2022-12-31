package org.Functional_Interfaces_Java;

public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {   //create anonymous inner class object
            @Override
            public void run() {
                System.out.println("new thread created");
            }
        }).start();
    }
}
