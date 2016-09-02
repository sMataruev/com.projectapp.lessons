package com.projectapp.lessons._4_ForClassesAndMethods_Detail;

/**
 * Пример передачи по значению и по ссылке
 * Вопрос: что выведет на консоль
 */
public class Test {



    public static void main(String[] args) {

        int x = 0;
        int[] ar = {20};

        int[] aaa = {0};

        f(x, ar);
        System.out.println(x + " " + ar[0]);

        g(x, ar);
        System.out.println(x + " " + ar[0]);

    }


    public static void f(int x, int[] ar) {
        x += 20;
        ar[0] = 40;
    }

    public static void g(int x, int[] arr) {
        x = 50;
        int[] aarr = new int[]{60};

    }


}
