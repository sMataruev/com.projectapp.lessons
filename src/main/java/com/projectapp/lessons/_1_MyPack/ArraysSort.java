package com.projectapp.lessons._1_MyPack;


import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {

//        Сортировка массива целых чисел по возрастанию:
//            Создаем массив случайных чисел
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
//Сортируем массив
        Arrays.sort(arr);
//Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }


//Сортировка массива целых чисел по убыванию:
//Создаем массив случайных чисел
        Integer arrr[] = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");

//Сортируем массив
        Arrays.sort(arrr, Collections.reverseOrder());
//Выводим отсортированный массив на консоль.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }


//        Сортировка массива строк в Java:
        String[] names = new String[]{"Roman", "Anna", "Petr", "Maria"};
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "  ");
        }
    }
/******************************Сортировка массива при помощи метода sort() из класса Arrays *****
 * Метод sort() из класса Arrays использует усовершенствованный алгоритм Быстрой сортировки (Quicksort),
 * который эффективен в большинстве случаев.
 * Для того чтобы отсортировать массив, необходимо написать всего одну строку. Находиться в import java.util.*;
 */
}
