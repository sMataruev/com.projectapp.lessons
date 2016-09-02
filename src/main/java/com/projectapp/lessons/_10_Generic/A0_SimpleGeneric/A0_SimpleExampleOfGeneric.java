package com.projectapp.lessons._10_Generic.A0_SimpleGeneric;


public class A0_SimpleExampleOfGeneric<T> {

    T ob;

    public A0_SimpleExampleOfGeneric(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void show() {
        System.out.println("Типом Т является " + ob.getClass().getName());
    }
}
