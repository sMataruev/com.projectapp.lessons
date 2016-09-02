package com.projectapp.lessons._6_Exception;

/**
 * /
 * Оператор finally образует блок кода, который будет выполнен по завершении
 * блока операторов try/catch, но перед следующим за ним кодом. Блок оператора
 * finally выполняется независимо от того, сгенерировано ли исключение
 * или нет. Если исключение сгенерировано, блок оператора finally выполняется,
 * даже при условии, что ни один из операторов catch не совпадает с этим исключением.
 * Указывать оператор finally необязательно, но каждому оператору try требуется хотя бы
 * один оператор catch или finally.
 */

public class A6_Exception {

    public static void myMethod_A() {

        try {
            System.out.println("В теле метода myMethod_A()");
            throw new RuntimeException("Исключение RuntimeException");
        } finally {
            System.out.println("Блок finally из метода myMethod_A() ");
        }

    }

    public static void myMethod_B() {

        try {
            System.out.println("В теле метода myMethod_B()");
            //возвратить управление из метода
            return;
        } finally {
            System.out.println("Блок finally из метода myMethod_B() ");

        }

    }

    public static void myMethod_C() {

        try {
            System.out.println("В теле метода myMethod_C()");
        } finally {
            System.out.println("Вызов finally из метода myMethod_C()");
        }

    }


    public static void main(String[] args) {

        try {
            myMethod_A();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено!");
        }
        System.out.println("\n*****************************\n");

        myMethod_B();
        System.out.println("\n*****************************\n");

        myMethod_C();
        System.out.println("\n*****************************\n");

    }
}
