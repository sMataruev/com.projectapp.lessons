package com.projectapp.lessons._7_Multithreading._4_A9_Multithread_Deadlocks;


public class A9_Deadlock_A {

    synchronized void foo (A9_Deadlock_B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " Вошел в метод foo() класса А ");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(" Перехвачен в классе А ");
        }
        System.out.println(name + " Пытается вызвать метод last() класса B ");
        b.last();
    }

    synchronized void last() {
        System.out.println(" В методе A.last() ");
    }

}
