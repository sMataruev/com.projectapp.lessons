package com.projectapp.lessons._4_ForClassesAndMethods_Detail;


public class Test2 {

    private int a;
    private int b;

    Test2() {

    }

    Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void fun() {
        this.a -= 5;
        this.b += 5;
    }

    public void fun2(Test2 ob) {
        ob.a -= 5;
        ob.b += 5;
    }


    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        Test2 ob = new Test2();
        Test2 ob2 = new Test2(15, 15);

        System.out.println(" a и b до вызова = " + a + " " + b);
        ob.fun();
        System.out.println(" a и b после вызова метода = " + a + " " + b);
        System.out.println();


        System.out.println("Test2 a и b до вызова " + ob2.a + " " + ob2.b);
        ob2.fun2(ob2);
        System.out.println("Test2 a и b после  вызова " + ob2.a + " " + ob2.b);


        System.out.println("*****");
        Test2 obb = new Test2();
        System.out.println(obb.a + " " + obb.b);





    }
}
