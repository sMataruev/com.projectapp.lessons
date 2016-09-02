package com.projectapp.lessons._7_Multithreading._4_A9_Multithread_Deadlocks;


public class A9_Deadlock_Main implements Runnable {

    A9_Deadlock_A deadlock_a = new A9_Deadlock_A();
    A9_Deadlock_B deadlock_b = new A9_Deadlock_B();

   A9_Deadlock_Main() {
       Thread.currentThread().setName("Главный поток! ");
       Thread t = new Thread(this, " Соперничающий поток");
       t.start();

       deadlock_a.foo(deadlock_b);
       System.out.println("Назад в главный поток ");
   }

    @Override
    public void run() {
        deadlock_b.bar(deadlock_a);
        System.out.println("Назад в другой поток ");
    }

    public static void main(String[] args) {

        new A9_Deadlock_Main();

    }
}
