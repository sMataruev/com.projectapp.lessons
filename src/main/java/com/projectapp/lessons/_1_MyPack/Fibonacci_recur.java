package com.projectapp.lessons._1_MyPack;


public class Fibonacci_recur {
    public static void main(String[] args) {

        int n = 11;
        for (int i = 1; i <= n; i++) {
            System.out.print(f(i) + " ");
        }
    }

    private static int f(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }
    }


}
