package com.projectapp.lessons._5_Inheritance._2_OverrideMethod;


public class A2_B extends A2_A {

    private String msg;

    public A2_B(int a, int b, String name) {
        super(a, b);
        this.msg = name;
    }


    public void show(String msg) {
        System.out.println("A2_B msg = " + msg);
    }

}
