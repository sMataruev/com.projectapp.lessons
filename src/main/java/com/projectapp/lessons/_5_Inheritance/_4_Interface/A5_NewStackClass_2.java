package com.projectapp.lessons._5_Inheritance._4_Interface;

/**
 * Здесь практически тоже самое, за одним нюансом.
 * Стек фиксированный! когда он увеличивается и (раньше вылетела б ошибка) он удваивается вдвое.
 * тем самым увеличивает свой обьем!
 * Получается динамический такой стек.
 */
public class A5_NewStackClass_2 implements A5_NewStackInterface {

    private int[] stck;
    private int ver;

    A5_NewStackClass_2(int size) {
        stck = new int[size];
        ver = -1;
    }

    @Override
    public void push(int item) {

        if (ver == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; //удвоили размер
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++ver] = item;

            System.out.println("Stack заполнен");
        } else {
            stck[++ver] = item;
        }
    }

    @Override
    public int pop() {
        if (ver < 0) {
            System.out.println("Stack не загружен");
            return 0;
        } else
            return stck[ver--];
    }
}
