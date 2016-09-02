package com.projectapp.lessons._11_Lambda.A1_LambdaMethodWithParametr;


public class A1_Main {
    public static void main(String[] args) {


        A1_MyNumber myNumber;
        A1_MyNumber myNumber2;

        myNumber = (n) -> (n % 2) == 0; //в этом случае 'n' выводится из КОНТЕКСТА и 'n' НЕЯВНО указывается 'int n'
//        или можно указать явно тип 'n'
//        myNumber = (int n) -> (n % 2) == 0;

        System.out.println("Проверка на четность");
        System.out.println("10 % 2 == 0 " + myNumber.isNumber(10));
        System.out.println("23 % 2 != 0 " + !myNumber.isNumber(23));

        System.out.println("Проверка на равенство");
        myNumber = (n) -> n > 0;
        myNumber2 = (y) -> y < 10;

        System.out.println("5 > 0  " + myNumber.isNumber(5));
        System.out.println("0 > 0  " + myNumber.isNumber(0));

        System.out.println("9 < 19  " + myNumber2.isNumber(9));
        System.out.println("90 < 10  " + myNumber2.isNumber(90));
    }
}
