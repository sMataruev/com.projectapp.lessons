package com.projectapp.lessons._1_MyPack;


public class Factorial {
    public static void main(String[] args) {

        int a = factorial(5);
        System.out.println(a);
    }

    static int factorial(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    static int factorialIteration(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
