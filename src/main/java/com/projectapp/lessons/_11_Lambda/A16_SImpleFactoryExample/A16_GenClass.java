package com.projectapp.lessons._11_Lambda.A16_SImpleFactoryExample;


public class A16_GenClass<T> {
    private T a;

    public A16_GenClass(T a) {
        this.a = a;
    }
    public A16_GenClass() {
         a = null;
    }

    public T getA() {
        return a;
    }
}
