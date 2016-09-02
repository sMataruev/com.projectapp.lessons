package com.projectapp.lessons._10_Generic.A10_GenericSubClass;


public class A10_GenSubClass<T> extends A10_NotGenericSuperClass {

    T value;

    public A10_GenSubClass(T value, int a) {
        super(a);
        this.value = value;
    }



    public T getValue() {
        return value;
    }

}
