package com.projectapp.lessons._4_ForClassesAndMethods_Detail;

/**
 * Внутренние классы можно обьявлять в теле любого когда! даже в циклах
 */

public class A2_InnerClassinLoops {

    int a;

    public A2_InnerClassinLoops(int a) {
        this.a = a;
    }

    public void myLoops() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                public void displayShow() {
                    System.out.println("Display Show: " + a);
                }
            }
            Inner ob = new Inner();
            ob.displayShow();
        }
    }

    public static void main(String[] args) {

        A2_InnerClassinLoops ob = new A2_InnerClassinLoops(10);
        ob.myLoops();


    }
}



