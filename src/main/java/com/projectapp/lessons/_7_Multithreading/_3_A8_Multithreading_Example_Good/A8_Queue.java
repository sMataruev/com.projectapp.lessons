package com.projectapp.lessons._7_Multithreading._3_A8_Multithreading_Example_Good;


public class A8_Queue {

    int a;
    boolean valueSet = false;

    public synchronized int getA() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Class A8_Queue method getA() перехвачен! ");
            }
        }
        System.out.println("Получено <- " + a);
        valueSet = false;
        notify();
        return a;
    }

    public synchronized void setA(int a) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Class A8_Queue method setA() перехвачен");
            }
        }
        this.a = a;
        valueSet = true;
        System.out.println("Поставил --> " + a);
        notify();
    }
}
