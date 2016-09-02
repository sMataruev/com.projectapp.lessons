package com.projectapp.lessons._11_Lambda.A12_RefOnGenericMethod;




public class A12_MyGenericMethod {
    public static <T> int myGenMethod(A12_MyFunc<T> a, T[] vals, T c) {
        return a.myFunc(vals, c);
    }
}
