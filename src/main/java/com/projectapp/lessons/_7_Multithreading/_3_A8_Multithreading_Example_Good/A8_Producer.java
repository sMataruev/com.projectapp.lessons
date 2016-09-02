package com.projectapp.lessons._7_Multithreading._3_A8_Multithreading_Example_Good;


public class A8_Producer implements Runnable {

    A8_Queue queue;
    Thread t;

    public A8_Producer(A8_Queue queue) {
        this.queue = queue;
        t = new Thread(this, "Поток Поставщик ");
        System.out.println(t.getName());
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.setA(i++);
            if (i == 40) {
                return;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
