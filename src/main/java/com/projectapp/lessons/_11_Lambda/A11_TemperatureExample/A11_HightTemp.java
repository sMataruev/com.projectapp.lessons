package com.projectapp.lessons._11_Lambda.A11_TemperatureExample;


public class A11_HightTemp {
    private int hTemp;

    public A11_HightTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean HighTempFun(A11_HightTemp ob) {
        return hTemp == ob.hTemp;
    }

    boolean lessThanTemp(A11_HightTemp ob) {
        return hTemp < ob.hTemp;
    }
}
