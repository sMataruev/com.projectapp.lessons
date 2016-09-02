package com.projectapp.lessons._7_Multithreading._1_A5_Multithreading_Synchronized_Example;


public class A5_Callme_Multithread_NotSynch {

    /**synchronized*/ void  call (String smg) {
        try {
            System.out.print("[" + smg);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано! ");
        }
        System.out.println("]");
    }



}
