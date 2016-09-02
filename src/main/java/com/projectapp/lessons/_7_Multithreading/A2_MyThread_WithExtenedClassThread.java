package com.projectapp.lessons._7_Multithreading;


public class A2_MyThread_WithExtenedClassThread extends  Thread{

    A2_MyThread_WithExtenedClassThread() {
        super("Демонстрирующий поток! ");
        System.out.println("Дочерний поток " + this);
        start();
    }


    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            try {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван!");
            }
        }
        System.out.println("Дочерний поток завершен!");

    }

    public static void main(String[] args) {

        new A2_MyThread_WithExtenedClassThread();

        for (int i = 5; i > 0; i--) {

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
