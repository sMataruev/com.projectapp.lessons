package com.projectapp.lessons._7_Multithreading._3_A7_Multithreading_Example_bad;


public class A7_Consumer implements Runnable {

    A7_Queue queue;

    public A7_Consumer(A7_Queue queue) {
        this.queue = queue;
        new Thread(this, " Потребитель ").start();
    }

    @Override
    public void run() {

        int i = 0;
        while (i < 20) {
            queue.getA();
            i++;
        }
    }
}
