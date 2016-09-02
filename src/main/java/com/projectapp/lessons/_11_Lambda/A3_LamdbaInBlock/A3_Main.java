package com.projectapp.lessons._11_Lambda.A3_LamdbaInBlock;


public class A3_Main {
    public static void main(String[] args) {

        A3_IMyFactorial myFactorial;

        myFactorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int a = myFactorial.Imyfact(5);
        System.out.println("Факториал 5 равен " + a);

        int b = myFactorial.Imyfact(6);
        System.out.println("Факториал 10 равен " + b);


    }
}
