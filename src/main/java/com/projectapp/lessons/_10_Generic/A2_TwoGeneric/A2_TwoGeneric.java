package com.projectapp.lessons._10_Generic.A2_TwoGeneric;


public class A2_TwoGeneric<T, V> {

    private T obT;
    private V obV;

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public A2_TwoGeneric(T obT, V obV) {

        this.obT = obT;
        this.obV = obV;
    }

    public void showType() {
        System.out.println("obT = " + obT.getClass().getName());
        System.out.println("obV = " + obV.getClass().getName());
    }


}
