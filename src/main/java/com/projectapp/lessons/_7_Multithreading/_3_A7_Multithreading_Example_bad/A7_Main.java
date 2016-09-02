package com.projectapp.lessons._7_Multithreading._3_A7_Multithreading_Example_bad;


public class A7_Main {
    public static void main(String[] args) {


        A7_Queue queue = new A7_Queue();
        new A7_Producer(queue);
        new A7_Consumer(queue);





    }
}
