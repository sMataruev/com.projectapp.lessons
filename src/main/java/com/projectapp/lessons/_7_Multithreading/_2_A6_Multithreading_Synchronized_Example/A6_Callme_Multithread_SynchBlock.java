package com.projectapp.lessons._7_Multithreading._2_A6_Multithreading_Synchronized_Example;


public class A6_Callme_Multithread_SynchBlock {

    void call (String smg) {
        try {
            System.out.print("[" + smg);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано! ");
        }
        System.out.println("]");
    }
}
