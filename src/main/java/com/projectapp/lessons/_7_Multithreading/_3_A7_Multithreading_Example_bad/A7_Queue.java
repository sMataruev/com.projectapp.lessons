package com.projectapp.lessons._7_Multithreading._3_A7_Multithreading_Example_bad;


public class A7_Queue {

    int a;

    public synchronized int getA() {
        System.out.println("Получено <- " + a);
        return a;
    }

    public synchronized void setA(int a) {
        this.a = a;
        System.out.println("Поставил -> " + a);
    }
}
