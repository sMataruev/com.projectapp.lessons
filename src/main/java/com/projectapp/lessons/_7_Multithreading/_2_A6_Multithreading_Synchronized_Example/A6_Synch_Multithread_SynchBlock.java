package com.projectapp.lessons._7_Multithreading._2_A6_Multithreading_Synchronized_Example;


public class A6_Synch_Multithread_SynchBlock {

    public static void main(String[] args) {


        A6_Callme_Multithread_SynchBlock target = new A6_Callme_Multithread_SynchBlock();
        Thread t = Thread.currentThread();

        A6_Caller_Multithread_SynchBlock caller1 = new A6_Caller_Multithread_SynchBlock("Добро пожаловать ", target);
        A6_Caller_Multithread_SynchBlock caller2 = new A6_Caller_Multithread_SynchBlock("в сигхронизорованный ", target);
        A6_Caller_Multithread_SynchBlock caller3 = new A6_Caller_Multithread_SynchBlock("метод ", target);


        try {
            caller1.thread.join();
            caller2.thread.join();
            caller3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Преовано!");
        }
        System.out.println("Главный поток ЗАВЕРШЕН! " + t);


    }
}
