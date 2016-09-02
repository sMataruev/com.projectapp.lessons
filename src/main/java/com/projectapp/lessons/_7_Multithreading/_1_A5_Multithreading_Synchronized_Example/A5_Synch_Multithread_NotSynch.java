package com.projectapp.lessons._7_Multithreading._1_A5_Multithreading_Synchronized_Example;


public class A5_Synch_Multithread_NotSynch {

    public static void main(String[] args) {

        A5_Callme_Multithread_NotSynch target = new A5_Callme_Multithread_NotSynch();

        A5_Caller_Multithread_NotSynch caller1 = new A5_Caller_Multithread_NotSynch("Добро пожаловать ", target);
        A5_Caller_Multithread_NotSynch caller2 = new A5_Caller_Multithread_NotSynch("в синхонизированный ", target);
        A5_Caller_Multithread_NotSynch caller3 = new A5_Caller_Multithread_NotSynch("метод! ", target);


        try {
            caller1.thread.join();
            caller2.thread.join();
            caller3.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван!");
        }
        System.out.println("Главный поток завершен! ");


    }
}
