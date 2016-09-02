package com.projectapp.lessons._7_Multithreading;


public class A0_DemoOfThreads {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        System.out.println("Главный поток: " + thread);
        System.out.println();
        System.out.println("Главный поток переименован!");
        thread.setName("Мой главный поток");
        System.out.println(thread);

        for (int i = 10; i > 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Мой поток прерван (");
            }
        }
        System.out.println("Завершение моего потока!");


    }
}
