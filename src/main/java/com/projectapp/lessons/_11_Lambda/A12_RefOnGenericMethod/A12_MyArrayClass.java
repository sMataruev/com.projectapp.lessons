package com.projectapp.lessons._11_Lambda.A12_RefOnGenericMethod;


public class A12_MyArrayClass {
    public static  <T> int myCountAr(T[] values, T b) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] == b)
                count++;

        }
        return count;
    }
}
