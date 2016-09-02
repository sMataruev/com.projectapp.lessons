package com.projectapp.lessons._7_Multithreading._4_A9_Multithread_Deadlocks;


public class A9_Deadlock_B {

    synchronized void bar(A9_Deadlock_A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Вошел в метод bar() класса B");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(" Перешвачен в классе B");
        }
        System.out.println(name + " Пытается вызвать метод last() из класса А");
        a.last();
    }


    synchronized void last() {
        System.out.println(" В методе B.last()  ");
    }
}
