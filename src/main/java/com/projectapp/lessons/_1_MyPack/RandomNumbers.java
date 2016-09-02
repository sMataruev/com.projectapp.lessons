package com.projectapp.lessons._1_MyPack;


public class RandomNumbers {
    public static void main(String[] args) {
        /******************************** Случайные числа */

        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //элементу массива присваивается случайное число от 0 до 99
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
//         Сортируем
        System.out.print("\n");
        BubbleSortArrays.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

//        Или
        System.out.print("\n");
        SelectionSortArrays.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
