package com.projectapp.lessons._11_Lambda.A11_TemperatureExample;


public class A11_ObjectRefExample {

    static <T> int counter(T[] vals, A11_MyFunc<T> f, T v) {

        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if (f.func(vals[i], v)) {
                count++;
            }
        }
        return count;
    }
}
