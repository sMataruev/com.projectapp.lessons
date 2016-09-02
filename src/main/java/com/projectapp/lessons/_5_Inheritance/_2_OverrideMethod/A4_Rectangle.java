package com.projectapp.lessons._5_Inheritance._2_OverrideMethod;


public class A4_Rectangle extends A4_Figur {


    public A4_Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double showArea() {
        System.out.print("Площадь четырехугольника равна = ");
        return a * b;
    }
}
