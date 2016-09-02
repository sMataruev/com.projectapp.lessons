package com.projectapp.lessons._11_Lambda.A16_SImpleFactoryExample;

import static com.projectapp.lessons._11_Lambda.A16_SImpleFactoryExample.A16_FactoryClass.factory;

public class A16_Main {
    public static void main(String[] args) {


        A16_MyFunc<A16_GenClass<Double>, Double> myFunc = A16_GenClass<Double>::new;
        A16_GenClass<Double> genClass = factory(myFunc, 999.99);
        System.out.println(genClass.getA());


        /*************************************************/


        A16_MyFunc<A16_NoGenClass, String> myFunc2 = A16_NoGenClass::new;
        A16_NoGenClass noGenClass = factory(myFunc2, "this is Lambda :)");
        System.out.println(noGenClass.getA());




    }
}
