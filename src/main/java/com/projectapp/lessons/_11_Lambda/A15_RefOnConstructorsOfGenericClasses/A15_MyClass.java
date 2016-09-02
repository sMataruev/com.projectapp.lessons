package com.projectapp.lessons._11_Lambda.A15_RefOnConstructorsOfGenericClasses;


public class A15_MyClass<T> {
    private T a;

    public A15_MyClass(T a) {
        this.a = a;
    }
    public A15_MyClass() {
         a = null;
    }

    public T getA() {
        return a;
    }
}
