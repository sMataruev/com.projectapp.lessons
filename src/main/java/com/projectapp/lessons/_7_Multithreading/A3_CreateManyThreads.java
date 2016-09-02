package com.projectapp.lessons._7_Multithreading;


public class A3_CreateManyThreads implements Runnable {

    Thread t;
    String threadNames;

    public A3_CreateManyThreads(String threadNames) {
        this.threadNames = threadNames;
        t = new Thread(this, threadNames);
        System.out.println("Новый поток под именем " + this.threadNames);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(threadNames + " " + i );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadNames + " ПРЕРВАН");
        }
        System.out.println(threadNames + " ЗАВЕРШЕН");

    }




    public static void main(String[] args) {

        new A3_CreateManyThreads("ОДИН");
        new A3_CreateManyThreads("ДВА");
        new A3_CreateManyThreads("ТРИ");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен!");


    }
}
