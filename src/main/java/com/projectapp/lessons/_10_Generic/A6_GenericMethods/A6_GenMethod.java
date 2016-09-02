package com.projectapp.lessons._10_Generic.A6_GenericMethods;


public class A6_GenMethod<I extends Number, I1 extends Number> {

    public static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] ob) {
        for (int i = 0; i < ob.length; i++) {
            if (x.equals(ob[i]))
                return true;
        }
        return false;
    }
}
