package com.projectapp.lessons._10_Generic.A3_LimitedTypeGeneric;


public class A3_LiitedFail<T> {

    private T[] nums;

    public A3_LiitedFail(T[] ob) {
        this.nums = ob;
    }

    //подчет среднеарифметического в массиве
    public double myFun() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
//            getResult += nums[i].doubleValue(); //Ошибка!
        }
        return sum / nums.length;

    }
}
