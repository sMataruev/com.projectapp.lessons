package com.projectapp.lessons._11_Lambda.A5_GenericFunctionalInterface;


import com.projectapp.lessons._4_ForClassesAndMethods_Detail.A;

public class A5_Main {
    public static void main(String[] args) {

        A5_GenFunctionalInterface<String> myUpper;

        myUpper = (a) -> {
            String resultStr = "";
            for (int i = 0; i < 2; i++) {
                resultStr += a.toUpperCase() + " ";
            }
            return resultStr;
        };
        String myNewUppString = myUpper.mySomeFunc("hello world");
        System.out.println(myNewUppString);

/**************************************************/

        A5_GenFunctionalInterface<Integer> myFactorial;
        myFactorial = (n) -> {
            int res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        };
        int fact = myFactorial.mySomeFunc(5);
        System.out.println("Факториал числа 5 = " + fact);




    }
}
