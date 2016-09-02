package com.projectapp.lessons._5_Inheritance._2_OverrideMethod;


public class A4_Triangle extends A4_Figur {

    public A4_Triangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double showArea() {
        System.out.print("Площадь треугольника равна = ");
        return (a * b) / 2;
    }
}
