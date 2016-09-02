package com.projectapp.lessons._5_Inheritance._2_OverrideMethod;


public class A1_B extends A1_A {
    int k;

    public A1_B(int a, int b, int k) {
        super(a, b);
        this.k = k;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("A1_B k = " + k);
    }
}
