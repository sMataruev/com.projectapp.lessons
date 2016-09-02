package com.projectapp.lessons._11_Lambda.A14_RefOnConstructors;


public class A14_MyClass {
    private int a;

    public A14_MyClass(int a) {
        this.a = a;
    }
    public A14_MyClass() {
        this.a = 0;
    }

    public int getA() {
        return a;
    }
}
