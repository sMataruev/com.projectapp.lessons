package com.projectapp.lessons._11_Lambda.A8_LambdaAndLocalAvariable;


public class A8_Main {
    public static void main(String[] args) {

        int sum = 10;

        A8_LocalAvariable local = (n) -> {

            int a = sum + n; //так можно, так как getResult мы не изменяли

//            getResult++; а так нельзя так как getResult мы пытаемся увелечить на 1
//            getResult = 9; так тоже нельзя! getResult переменная не должна изменятся в лямбда-выражении
//          переманная getResult должна быть ЗАВЕРШЕННОЙ! это значит обьявленной раз, а дальше можно с ней работать


            return a;
        };



    }
}
