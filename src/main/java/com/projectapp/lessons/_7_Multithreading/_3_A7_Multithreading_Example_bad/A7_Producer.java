package com.projectapp.lessons._7_Multithreading._3_A7_Multithreading_Example_bad;


public class A7_Producer implements Runnable {

    A7_Queue queue;

    public A7_Producer(A7_Queue queue) {
        this.queue = queue;
        new Thread(this, " Поставщик ").start();
    }

    @Override
    public void run() {
        int i = 0;
            while (true) {
                queue.setA(i++);
                if (i == 20) {
                    return;
                }
            }


    }
}
