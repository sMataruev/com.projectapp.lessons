package com.projectapp.lessons._11_Lambda.A14_RefOnConstructors;


public class A14_Main {
    public static void main(String[] args) {


        A14_MyFunc refOnMyFunc = A14_MyClass::new;
        A14_MyClass myClass = refOnMyFunc.muFunc(5);
        System.out.println(myClass.getA());


    }
}
