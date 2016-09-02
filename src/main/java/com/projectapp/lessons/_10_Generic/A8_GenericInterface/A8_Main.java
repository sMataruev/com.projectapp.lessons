package com.projectapp.lessons._10_Generic.A8_GenericInterface;


import java.util.Arrays;

public class A8_Main {
    public static void main(String[] args) {


        Integer[] arInt = {14, 6, 3, 5, 6, 1, 8, 6,};
        Character[] arChar = {'a', 'c', 't', 'f', 'j', 'b'};


        A8_MinMaxInteface<Integer> obInt = new A8_MinMaxClass(arInt);

        A8_MinMaxInteface<Character> obChar = new A8_MinMaxClass(arChar);

        System.out.println("Min = " + obInt.min());
        System.out.println("Max = " + obInt.max());

        System.out.println("Min = " + obChar.min());
        System.out.println("Max = " + obChar.max());




    }
}
