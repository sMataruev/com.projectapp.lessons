package com.projectapp.lessons._7_Multithreading._3_A8_Multithreading_Example_Good;


public class A8_Consumer implements Runnable {

    A8_Queue queue;
    Thread t;

    public A8_Consumer(A8_Queue queue) {
        this.queue = queue;
        t = new Thread(this, "Поток Потребитель ");
        System.out.println(t.getName());
        t.start();
    }

    @Override
    public void run() {

        int i = 0;

        while (i < 40) {
            queue.getA();
            i++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
