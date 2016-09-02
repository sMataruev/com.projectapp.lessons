package com.projectapp.lessons._5_Inheritance._4_Interface;


public class A5_NewStackClass implements A5_NewStackInterface {

    private int[] stck;
    private int ver;

    public A5_NewStackClass(int size) {
        stck = new int[size];
        ver = -1;
    }


    @Override
    public void push(int item) {
        if (ver == stck.length -1) {
            System.out.println("Stack заполнен");
        } else {
            stck[++ver] = item;
        }
    }


    @Override
    public int pop() {
        if (ver < 0) {
            System.out.println("Stack не загружен");
            return 0;
        } else
            return stck[ver--];
    }
}
