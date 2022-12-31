package org.Functional_Interfaces_Java;

public class Test01 {
    public static void main(String[] args) {
        new Thread(()->{   // lambda expression to create the object
            System.out.println("New Thread Create");
        }).start();
    }
}
