package com.projectapp.lessons._10_Generic.A11_OverrideGeneriMethods;


public class A11_OverMethod_2<T> extends A11_OverMethod<T> {
    public A11_OverMethod_2(T value) {
        super(value);
    }

    @Override
    public T getValue() {
        System.out.print("Метод из класса A11_OverMethod_2 ");
        return value;
    }
}
