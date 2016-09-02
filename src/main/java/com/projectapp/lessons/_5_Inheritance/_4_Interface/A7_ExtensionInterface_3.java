package com.projectapp.lessons._5_Inheritance._4_Interface;


public class A7_ExtensionInterface_3 implements A7_ExtensionInterface_2{
    @Override
    public void myFun3() {
        System.out.println("Метод из A7_ExtensionInterface_2");
    }

    @Override
    public void myFun1() {
        System.out.println("Метод из A7_ExtensionInterface_1");
    }

    @Override
    public void myFun2() {
        System.out.println("Метод из A7_ExtensionInterface_1");
    }


}
