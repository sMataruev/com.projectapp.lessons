package com.projectapp.lessons._7_Multithreading;


public class A4_MyThead_JoinMethod implements Runnable {

    Thread thread;
    String name;

    public A4_MyThead_JoinMethod(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("Новый поток " + this.name);
        thread.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + " поток " + i);
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " поток прерван");
        }
        System.out.println(name + " поток завершен");

    }


    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        A4_MyThead_JoinMethod ob1 = new A4_MyThead_JoinMethod("Один");
        A4_MyThead_JoinMethod ob2 = new A4_MyThead_JoinMethod("ДВА");
        A4_MyThead_JoinMethod ob3 = new A4_MyThead_JoinMethod("ТРИ");

        System.out.println("Поток ОДИН  жив ? " + ob1.thread.isAlive());
        System.out.println("Поток ДВА жив ? " + ob2.thread.isAlive());
        System.out.println("Поток ТРИ жив ? " + ob3.thread.isAlive());

        System.out.println("Ожидание завершение потоков!");

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Главнй поток прерван! " + t);
        }

        System.out.println("Поток ОДИН жив ? " + ob1.thread.isAlive());
        System.out.println("Поток ДВА жив ? " + ob2.thread.isAlive());
        System.out.println("Поток ТРИ жив ? " + ob3.thread.isAlive());

        System.out.println("Главнй поток ЗАВЕРШЕН! " + t);

    }
}
