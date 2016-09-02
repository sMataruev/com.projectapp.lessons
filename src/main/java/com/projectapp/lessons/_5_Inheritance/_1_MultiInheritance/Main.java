package com.projectapp.lessons._5_Inheritance._1_MultiInheritance;


public class Main {

    public static void main(String[] args) {


        A1_BoxSuper boxSuper = new A1_BoxSuper(10);
        A1_SubBox_B subBoxB = new A1_SubBox_B();
        A1_SubBox_C subBoxC = new A1_SubBox_C(5, 5, 5, 10, 19.99);
        A1_SubBox_C subBoxC2 = new A1_SubBox_C(14, 25, 25, 14, 5.45);

        double vol = subBoxC.res();


//        System.out.println("Обьем куба = " + vol);
//        System.out.println("Вес куба = " + subBoxC.weight);
//        System.out.println("Цена доставки куба = " + subBoxC.shipCost + "$");

        System.out.println(subBoxC.toString());


    }
}
