package com.projectapp.lessons._5_Inheritance._1_MultiInheritance;


public class A1_BoxSuper {

    private double width;
    private double heght;
    private double depth;

    A1_BoxSuper() {
        width = -1;
        heght = -1;
        depth = -1;
    }

    A1_BoxSuper(int len) {
        width = heght = depth = len;
    }

    A1_BoxSuper(A1_BoxSuper ob) {
        width = ob.width;
        heght = ob.heght;
        depth = ob.depth;
    }

    A1_BoxSuper(double w, double h, double d) {
        width = w;
        heght = h;
        depth = d;
    }

    protected double res () {
        return width * heght * depth;
    }

}
