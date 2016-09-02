package com.projectapp.lessons._4_ForClassesAndMethods_Detail;


public class B extends A {

    public void show() {
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    public void fun() {
        super.fun();
    }

    @Override
    protected void fun2() {
        super.fun2();
    }
}
