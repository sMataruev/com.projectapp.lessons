package com.projectapp.lessons._5_Inheritance;


public class A2_SubClass_Super extends A2_SuperCLass_Super {

    int myField;

    A2_SubClass_Super(int a, int b) {
        super.myField = a;
        myField = b;

    }

    public void show() {
        System.out.println("myField из Супер класса = " + super.myField);
        System.out.println("myField из подкласса = " + this.myField);
    }

    public static void main(String[] args) {

        A2_SubClass_Super obb = new A2_SubClass_Super(10, 10);

        obb.show();

    }
}
