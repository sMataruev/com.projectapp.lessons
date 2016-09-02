package com.projectapp.lessons._10_Generic.A9_GenericSuperClass;


public class A9_Main {
    public static void main(String[] args) {

        A9_GenSubClass<String, Integer> subClass = new A9_GenSubClass("World", 5);

        System.out.println(subClass.getValue());
        System.out.println(subClass.getValue2());



    }
}
