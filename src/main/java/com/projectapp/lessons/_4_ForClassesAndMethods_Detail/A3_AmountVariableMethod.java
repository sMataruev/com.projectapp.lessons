package com.projectapp.lessons._4_ForClassesAndMethods_Detail;

/** *
 * Метод с переменным колличеством аргументов
 * Внутри метода FUN переменная V действует как массив
 * При передачи людого колличества аргументов НЕЯВНО образается массив и ссылка передается переменной V
 * Параметр с переменной длинной может быть только ОДИН и должен обьявляться последним в списке
 * параметров метода!
 */

public class A3_AmountVariableMethod {

    static void fun(int... v) {
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //У метода с переменным количеством аргументов могут быть и другие типы аргументов, но при этом
    //параметр переменной длины должен быть ПОСЛЕДНИМ. Например:
    static void fun2(int a, double b, char ch, String str, int... vals) {
        System.out.print(a + " " + b + " " + ch + "  " + str + " " + vals.length + " ");
        for (int x : vals) {
            System.out.println(x);
        }
    }


    public static void main(String[] args) {

//        fun(1);
//        fun(1, 2, 3, 5, 6);
//        fun(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        fun(1, 2, 3, 4, 5, 6, 7, 7, 9, 10, 11, 12, 12, 13);

        fun2(1, 2.2, 'A', "Name", 10, 20, 30, 40, 50);

    }
}
