package com.projectapp.lessons._1_MyPack;

/**
 * Делает масив заданной длины
 * позже можно указать произвольный отрезок массива и вывести на консоль
 */
public class ArraysShowElementsFromTo {

    int[] ar;
    ArraysShowElementsFromTo() {

    }
    ArraysShowElementsFromTo(int size) {

        ar = new int[size];
        forConstructor();

    }

    //служебный метод, инициализирует массив. Вызывается из конструктора
    private void forConstructor() {
        for (int i = 0; i < ar.length; i++) {
            ar[i] += i;
        }
    }


    //Выводит на экран елементы массива в заданом диапазоне
    public void myFun(int from, int len) {
        if (ar[from] < len) {
            for (int i = from; i < len; i++) {
                System.out.print(ar[from += 1] + " ");
            }
        }
    }

    //Печатает массив
    public void myLoop() {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }


    public static void main(String[] args) {





    }
}
