package com.projectapp.lessons._5_Inheritance;


public class A1_BoxSubClass_SuperConst extends A1_BoxSuperClass {


    private double weight;

    A1_BoxSubClass_SuperConst() {
        super();

        weight = -1;
    }

    public A1_BoxSubClass_SuperConst(double wt, double h, double d) {
        super(wt, h, d);

        this.weight = widht * height * depht;
    }
    //Делаем КЛОН объекты
    public A1_BoxSubClass_SuperConst (A1_BoxSubClass_SuperConst ob) {
        super(ob); //передали управление конструктору из СУПЕР КЛАССА

        weight = ob.weight;
    }

    public A1_BoxSubClass_SuperConst(double w, double h, double d, double weight) {
        super(w, h, d);

        this.weight = weight;
    }

    @Override
    public double show() {

        return widht * height * depht;
    }

    public void showWeight() {
        System.out.println("Вес куба: " + weight);
    }
}
