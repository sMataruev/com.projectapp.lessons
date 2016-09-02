package com.projectapp.lessons._7_Multithreading._1_A5_Multithreading_Synchronized_Example;


public class A5_Caller_Multithread_NotSynch implements Runnable {

    String msg;
    A5_Callme_Multithread_NotSynch target;
    Thread thread;

    public A5_Caller_Multithread_NotSynch(String name, A5_Callme_Multithread_NotSynch t) {
        this.msg = name;
        target = t;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }



}
