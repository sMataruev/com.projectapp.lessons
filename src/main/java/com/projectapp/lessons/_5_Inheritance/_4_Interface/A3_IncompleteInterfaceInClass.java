package com.projectapp.lessons._5_Inheritance._4_Interface;

/**
 * Если класс включает в себя интерфейс , но не полностью реализует определенные
 * в нем методы , он должен быть объявлен как abstract
 *
 *
 *
 */

abstract class A3_IncompleteInterfaceInClass implements A1_InterfaceCallback {

    int a;
    int b;


    void show () {
        System.out.println("a + b = " + a + " " + b);
    }


    /** В этом примере  класс A3_IncompleteInterfaceInClass не реализует метод call(),
     поэтому он должен быть объявлен как абстрактный.
     Любой класс, наследующий
     от класса A3_IncompleteInterfaceInClass, должен реализовать метод call()
     или быть также объявленным
     как abstract.
     */



}
