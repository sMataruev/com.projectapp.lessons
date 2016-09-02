package com.projectapp.lessons._10_Generic.A1_DontGenericExample;


public class A1_Main {
    public static void main(String[] args) {

        A1_DontGeneric obInt = new A1_DontGeneric(88);
        A1_DontGeneric obStr = new A1_DontGeneric("Hello");


        obInt.showType();
        obStr.showType();

        int v = (Integer) obInt.getOb();
        String str = (String) obStr.getOb();

        System.out.println();
        System.out.println("v = " + v);
        System.out.println("str = " + str);
        System.out.println();

        obInt = obStr; //компилируется но это принципиально не правильно, нет типовой безопасности

        v = (Integer) obInt.getOb();//Ошибка комиляции
        System.out.println("obInt = " + obInt);


    }
}
