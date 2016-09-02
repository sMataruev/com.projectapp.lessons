package com.projectapp.lessons._6_Exception;

/**
 * В JDK 7 внедрили многократный перехват позволяет перехватывать несколько исключений в одном
 * и том же операторе catch.
 *
 *
 *
 */

public class A8_Exception_MultiCatch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] c = {1};


        try {
            int res = a / b;
            c[50] = 100;
            System.out.println(res + " " + c[50]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено!");
        }
        System.out.println("После Multi Catch");

    }
}
