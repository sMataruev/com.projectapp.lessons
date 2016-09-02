package com.projectapp.lessons._11_Lambda.A0_SimpleLambda;


public class A0_Main {
    public static void main(String[] args) {


        com.projectapp.lessons._11_Lambda.A0_SimpleLambda.A0_MyNumber number;
        number = () -> 123.3;

        System.out.println("Моё значение = " + number.getValue());


        number = () -> Math.random() * 50;
//        number = () -> Math.random() * Math.random() * 31;
        System.out.println("Случайное число = " + number.getValue());
        System.out.println("Случайное число = " + number.getValue());

        /**
         * Сделай тоже самое со строками
         * */


    }
}
