package com.projectapp.lessons._7_Multithreading._2_A6_Multithreading_Synchronized_Example;


public class A6_Caller_Multithread_SynchBlock implements Runnable {

    String msg;
    A6_Callme_Multithread_SynchBlock target;
    Thread thread;

    public A6_Caller_Multithread_SynchBlock(String name, A6_Callme_Multithread_SynchBlock t) {
        this.msg = name;
        target = t;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }


}
