package com.projectapp.lessons._1_MyPack;


public class SelectionSortArrays {
    public static void main(String[] args) {
        int[] arrr = {2, 5, 6, 1, 3, 7, 9, 8, 10};
        selectionSort(arrr);
        for (int i = 0; i < arrr.length; i++) {
            System.out.println(arrr[i]);
        }
    }
    /********************* Сортировка выбором
     * Метод оказывается эффективным только на маленьких массивах (не более 10)***/
    public static void selectionSort(int[] arr) {
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
    }
}
