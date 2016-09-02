package com.projectapp.lessons._7_Multithreading;


public class A1_MyFirstThread_WithRunnable implements Runnable {

    Thread t;

    public A1_MyFirstThread_WithRunnable() {
        t = new Thread(this, "Мой первый поток!");
        System.out.println("Дочерний поток создан");
        t.start();
    }

    @Override
    public void run() {

        for (int i = 10; i > 0; i--) {
            try {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван!");
            }
        }
        System.out.println("Дочерний поток завершен!");
    }

    public static void main(String[] args) {

        new A1_MyFirstThread_WithRunnable(); // создать новый поток

        for (int i = 10; i > 0; i--) {

            System.out.println("Главнй поток: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Главный поток прерван ");
            }
        }
        System.out.println("Главный поток завершен");


    }
}
