package com.projectapp.lessons._1_MyPack;


public class BubbleSortArrays {
    public static void main(String[] args) {

        int[] arrr = {2, 7, 4, 1, 8, 2, 9, 10};
        bubbleSort(arrr);
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
    }

    /******************************* Сортировка пузырьком
     * Единственный плюс алгоритма - простота его исполнения.***/

    public static void bubbleSort(int[] arr) {
    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
//            /*Сравниваем элементы попарно,
//              если они имеют неправильный порядок,
//              то меняем местами
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
