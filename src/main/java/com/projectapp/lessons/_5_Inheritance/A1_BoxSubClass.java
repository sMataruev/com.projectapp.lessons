package com.projectapp.lessons._5_Inheritance;


public class A1_BoxSubClass extends A1_BoxSuperClass {

    public double weight;

    public A1_BoxSubClass(double wt, double h, double d) {
        widht = wt;
        height = h;
        depht = d;

        this.weight = wt * h * d;
    }

    @Override
    public double show() {
        return widht * height * depht;
    }

    public void showWeight() {
        System.out.println("Вес куба: " + weight);

    }
}