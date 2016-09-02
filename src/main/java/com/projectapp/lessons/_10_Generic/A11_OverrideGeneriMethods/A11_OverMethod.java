package com.projectapp.lessons._10_Generic.A11_OverrideGeneriMethods;


public class A11_OverMethod<T> {
     T value;

    public A11_OverMethod(T value) {
        this.value = value;
    }

    public T getValue() {
        System.out.print("Метод из класса A11_OverMethod ");
        return value;
    }
}
