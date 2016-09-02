package com.projectapp.lessons._10_Generic.A2_TwoGeneric;


public class A2_Main {
    public static void main(String[] args) {

        com.projectapp.lessons._10_Generic.A2_TwoGeneric.A2_TwoGeneric<Integer, String> obGen = new A2_TwoGeneric<>(5, "Hello");

        obGen.showType();
        int v = obGen.getObT();
        String str = obGen.getObV();

        System.out.println("v = " + v);
        System.out.println("str = " + str);

    }
}
