package com.projectapp.lessons._11_Lambda.A15_RefOnConstructorsOfGenericClasses;


public class A15_Main {
    public static void main(String[] args) {


        A15_MyFunc<Integer> refOnMyFunc = A15_MyClass<Integer>::new;
        A15_MyClass<Integer> myClass = refOnMyFunc.muFunc(50);

        System.out.println(myClass.getA());


    }
}
