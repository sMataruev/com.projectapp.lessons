package com.projectapp.lessons._4_ForClassesAndMethods_Detail;


public class A1_Outer_Inner_Classes {


    private int a;
    private int b;
    private String name = "Sergey";

    public A1_Outer_Inner_Classes(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    public void showDisplay() {
        InnerClass ob = new InnerClass();
        ob.display();
    }

    protected class InnerClass {

        public void display() {
            System.out.println("Возраст: " + a);
            System.out.println("Вec: " + b);
            System.out.println("Имя: " + name);



        }
    }



    public static void main(String[] args) {

        A1_Outer_Inner_Classes ob = new A1_Outer_Inner_Classes(30, 83, "Sergey");
        ob.showDisplay();






    }
}
