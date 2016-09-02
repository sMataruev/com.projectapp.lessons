package com.projectapp.lessons._10_Generic.A6_GenericMethods;


import static com.projectapp.lessons._10_Generic.A6_GenericMethods.A6_GenMethod.isIn;

public class A6_Main {
    public static void main(String[] args) {

        Integer[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        if (isIn(2, integer))
            System.out.println("Такая цифра есть в масиве");


        if(!isIn(11, integer))
            System.out.println("Такой цифры нет в масиве");


        System.out.println("****************************");


        String[] str = {"Four", "Two", "Three", "One", "Five", "Six", "Seven"};

        if (isIn("Four", str)) {
            System.out.println("'Four' есть в масиве str");
        } else {
            System.out.println("'Four' нет в масиве str");
        }

/**  Что на самом деле происходит, мы здесь в операторе <Integer,Integer> указали явно
 *   Но явно указывать нужно в ОЧЕНЬ редких случаях
 *
 *   A6_GenMethod.<Integer, Integer>isIn(2, integer);
 *
 */
    }
}
