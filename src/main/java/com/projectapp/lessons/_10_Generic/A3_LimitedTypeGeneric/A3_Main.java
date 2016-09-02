package com.projectapp.lessons._10_Generic.A3_LimitedTypeGeneric;


public class A3_Main {
    public static void main(String[] args) {

        Integer nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        A3_LimitedGeneric<Integer> obInt = new A3_LimitedGeneric<>(nums);

        double v = obInt.myFun();
        System.out.println("Среднее число равно = " + v);

        System.out.println("**************************");

        Double numsDoble[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        A3_LimitedGeneric<Double> obDouble = new A3_LimitedGeneric<>(numsDoble);
        double vv = obDouble.myFun();
        System.out.println("Среднее число равно = " + vv);

        System.out.println("**************************");

//        String str[] = {"1", "2", "3", "4", "5"};
//        A3_LimitedGeneric<String> obStr = new A3_LimitedGeneric<String>(str);
//        double vvv = obStr.myFun();
//        System.out.println("Среднее число равно = " + vvv);
//

    }
}
