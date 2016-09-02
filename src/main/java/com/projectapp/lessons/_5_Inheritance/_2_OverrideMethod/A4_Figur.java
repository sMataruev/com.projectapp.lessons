package com.projectapp.lessons._5_Inheritance._2_OverrideMethod;


/**
 * Более практический пример (Применение переопределение методов)
 */
public class A4_Figur {

    protected int a;
    protected int b;

    public A4_Figur(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double showArea() {
        System.out.print("Площадь фигуры не определена! ");
        return 0;
    }

}
