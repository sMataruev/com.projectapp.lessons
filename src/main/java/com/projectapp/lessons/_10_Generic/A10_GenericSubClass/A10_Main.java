package com.projectapp.lessons._10_Generic.A10_GenericSubClass;


public class A10_Main {
    public static void main(String[] args) {


        A10_GenSubClass<String> ob = new A10_GenSubClass("Hello", 10);

        System.out.print(ob.getValue() + " ");
        System.out.println(ob.getA());

    }
}
