package com.projectapp.lessons._5_Inheritance._1_MultiInheritance;


public class A1_SubBox_C extends A1_SubBox_B {

    public double shipCost;

    public A1_SubBox_C(A1_SubBox_C ob) {
        super(ob);
        shipCost = ob.shipCost;
    }

    public A1_SubBox_C() {
        super();
        shipCost = -1;
    }

    public A1_SubBox_C(double w, double h, double d, double weight, double shipCost) {
        super(w, h, d, weight);
        this.shipCost = shipCost;
    }

    public A1_SubBox_C(int len, double weight, double shipCost) {
        super(len, weight);
        this.shipCost = shipCost;
    }

    @Override
    public double res() {
        return super.res();
    }

    @Override
    public String toString() {
        return "A1_SubBox_C{" + "shipCost = " + shipCost + "}";
    }
}
