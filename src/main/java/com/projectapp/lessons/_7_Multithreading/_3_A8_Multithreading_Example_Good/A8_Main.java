package com.projectapp.lessons._7_Multithreading._3_A8_Multithreading_Example_Good;


public class A8_Main {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        t.setName("Главнй поток! ");
        System.out.println(t.getName());

        A8_Queue a8_queue = new A8_Queue();
        new A8_Producer(a8_queue);
        new A8_Consumer(a8_queue);

        System.out.println(t.getName() + " ЗАВЕРШИЛСЯ");




    }
}
