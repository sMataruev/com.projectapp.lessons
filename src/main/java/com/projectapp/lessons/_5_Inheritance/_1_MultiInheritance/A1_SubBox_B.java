package com.projectapp.lessons._5_Inheritance._1_MultiInheritance;


public class A1_SubBox_B extends A1_BoxSuper {

    public double weight;

    public A1_SubBox_B(double weight) {
        this.weight = weight;
    }

    public A1_SubBox_B(int len, double weight) {
        super(len);
        this.weight = weight;
    }

    public A1_SubBox_B(double w, double h, double d, double weight) {
        super(w, h, d);
        this.weight = weight;
    }

    public A1_SubBox_B() {
        super();
        weight = -1;
    }

    public A1_SubBox_B(A1_SubBox_B ob) {
        super(ob);
        weight = ob.weight;
    }

    @Override
    public double res() {
        return super.res() + weight;
    }

    @Override
    public String toString() {
        return "A1_SubBox_B{" + " weight = " + weight + " }";
    }

}


