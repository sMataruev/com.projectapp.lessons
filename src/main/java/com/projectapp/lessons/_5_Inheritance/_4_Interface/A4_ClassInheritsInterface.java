package com.projectapp.lessons._5_Inheritance._4_Interface;


//класс наследует интерфейс A4_InnerInterface из класса A4_ClassAndInnerInterface
public class A4_ClassInheritsInterface implements A4_ClassAndInnerInterface.A4_InnerInterface {


    @Override
    public void fun(int a) {
        if ((a % 2) == 0) {
            System.out.println("Число четное ");
        } else {
            System.out.println("Число не четное! ");
        }
    }
}
