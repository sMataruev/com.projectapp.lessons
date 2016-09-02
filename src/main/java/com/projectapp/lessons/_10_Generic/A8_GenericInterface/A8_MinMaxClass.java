package com.projectapp.lessons._10_Generic.A8_GenericInterface;


public class A8_MinMaxClass<T extends Comparable<T>> implements A8_MinMaxInteface<T> {

    T[] values;

    public A8_MinMaxClass(T[] values) {
        this.values = values;
    }


    @Override
    public T min() {
        T v = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(v) < 0) {
                v = values[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i].compareTo(v) > 0) {
                v = values[i];
            }
        }
        return v;
    }
}
