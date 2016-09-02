package com.projectapp.lessons._11_Lambda.A16_SImpleFactoryExample;


public class A16_FactoryClass {
    public static <R, T> R factory(A16_MyFunc<R, T> a, T b) {
        return a.muFunc(b);
    }
}
