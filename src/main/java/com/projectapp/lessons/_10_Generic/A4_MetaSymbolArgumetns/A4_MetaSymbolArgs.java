package com.projectapp.lessons._10_Generic.A4_MetaSymbolArgumetns;



public class A4_MetaSymbolArgs <T extends Number>{

    private T[] nums;

    public A4_MetaSymbolArgs(T[] nums) {
        this.nums = nums;
    }

    public double myFun() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue(); //работает!
        }
        return sum / nums.length;
    }

    /**
     * НЕ ПРАВИЛЬНО! ПОЧЕМУ?
     *
            boolean sameVg(A4_MetaSymbolArgs<T> ob) {
                if (myFun() == ob.myFun()) {
                    return true;
                }
                return false;
            }
     */
    boolean sameVg(A4_MetaSymbolArgs<?> ob) {
        if (myFun() == ob.myFun()) {
            return true;
        }
        return false;
    }

}
