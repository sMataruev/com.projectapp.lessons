package com.projectapp.lessons._10_Generic.A3_LimitedTypeGeneric;


public class A3_LimitedGeneric<T extends Number> {
    private T[] nums;

    public A3_LimitedGeneric(T[] nums) {
        this.nums = nums;
    }

    public double myFun() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue(); //работает!
        }
        return sum / nums.length;
    }
}
