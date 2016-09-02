package com.projectapp.lessons._11_Lambda.A2_LambdaMethodWithTwoParamerts;


public class A2_Main {
    public static void main(String[] args) {

        A2_TwoNumbers twoNumbers;
        A2_TwoNumbers twoNumbers2;

        twoNumbers = (a, b) -> (a % b) == 0;
        System.out.println("(10 % 2) == 0 " + twoNumbers.isDivision(10, 2));

        twoNumbers = (a, b) -> (a % b) != 0;
        System.out.println("(10 % 3) != 0 " + twoNumbers.isDivision(10, 3));

        twoNumbers2 = (d, x) -> (d / x) > 0;
        System.out.println("(10 / 2) > 0 " + twoNumbers2.isDivision(10,2));

        //Можно писать вот так
        if (!twoNumbers.isDivision(40, 3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }



    }
}
