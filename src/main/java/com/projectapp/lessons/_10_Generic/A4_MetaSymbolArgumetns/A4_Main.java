package com.projectapp.lessons._10_Generic.A4_MetaSymbolArgumetns;


public class A4_Main {
    public static void main(String[] args) {


        Integer nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        A4_MetaSymbolArgs <Integer> obInt = new A4_MetaSymbolArgs<>(nums);
        double v = obInt.myFun();
        System.out.println("Среднее число равно = " + v);



        System.out.println("**************************");



        Double numsDoble[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        A4_MetaSymbolArgs<Double> obDouble = new A4_MetaSymbolArgs<>(numsDoble);
        double vv = obDouble.myFun();
        System.out.println("Среднее число равно = " + vv);



        System.out.println("**************************");


        if (obInt.sameVg(obDouble)) {
            System.out.println("Значения равны!");
        } else {
            System.out.println("Значения не равны!");
        }


        //Добавь сюда проверку с Float на равенство среднего значения

    }
}
