package org.Executor_Framework_Java;

class Threadprogram01 extends Thread {
    private String name;

    public Threadprogram01(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("I am running");
    for(int i=0; i<5; i++) {
        System.out.println("Print value:" + i);
    }
    }
    public static void main(String[] args) {
        Threadprogram01 t1 = new Threadprogram01("Ravi");
        t1.start();

    }

}
