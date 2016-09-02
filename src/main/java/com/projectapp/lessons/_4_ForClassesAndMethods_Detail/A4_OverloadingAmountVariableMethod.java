package com.projectapp.lessons._4_ForClassesAndMethods_Detail;

/**
 * Методы с переменным колличеством аргументов ничем не отличаются от обычных методов и тоже могут
 * ПЕРЕОПРЕДЕЛЯТЬСЯ! как обычные методы.
 */
public class A4_OverloadingAmountVariableMethod {

    static void fun(int... a) {
        System.out.println("fun с Int ... ");
        ;
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println("\n***********\n");
    }

    static void fun(double... a) {
        System.out.println("fun c double ... ");
        for (double x : a) {
            System.out.print(x + " ");
        }
        System.out.println("\n***********\n");
    }

    static void fun(String str, double... a) {
        System.out.println("fun с String и double ");
        System.out.print(str + " ");
        for (double x : a) {
            System.out.print(x + " ");
        }
        System.out.println("\n***********\n");
    }

    static void fun(boolean... a) {
        System.out.print("fun с boolean ");
        for (boolean x : a) {
            System.out.print(x + " ");

        }
        System.out.println("\n***********\n");
    }


    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);
        fun(true, true, false);
        fun(0.1, 0.2);
        fun("name", 1.1, 1.2);

    }
}
