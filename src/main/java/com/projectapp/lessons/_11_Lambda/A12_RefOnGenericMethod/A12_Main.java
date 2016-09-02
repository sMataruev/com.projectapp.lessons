package com.projectapp.lessons._11_Lambda.A12_RefOnGenericMethod;

import static com.projectapp.lessons._11_Lambda.A12_RefOnGenericMethod.A12_MyGenericMethod.myGenMethod;

public class A12_Main {
    public static void main(String[] args) {


        Integer[] myIntArr = {1, 2, 3, 4, 5, 4, 6, 4, 7, 4};
        String[] myStrAr = {"Один ", "Два ", "Три ", "Четыре ", "Пять", "Один "};
        int count;

        count = myGenMethod(A12_MyArrayClass::<Integer>myCountAr, myIntArr, 4);
        System.out.println("Мой массив содержит " + count + " числа 4");

        count = myGenMethod(A12_MyArrayClass::<String>myCountAr, myStrAr, "Один ");
        System.out.println("Мой массив содержит " + count + " = Один");



    }
}

