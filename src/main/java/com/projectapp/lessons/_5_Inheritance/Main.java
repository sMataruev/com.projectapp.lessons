package com.projectapp.lessons._5_Inheritance;


public class Main {
    public static void main(String[] args) {

        A1_BoxSuperClass ob = new A1_BoxSuperClass(7, 7, 7);
        A1_BoxSubClass obSub = new A1_BoxSubClass(25, 25, 25);

        A1_BoxSubClass_SuperConst obSub2 = new A1_BoxSubClass_SuperConst(15, 15, 15);

//        ob = obSub;
//        double c = ob.show();
//        System.out.println(c);

//        A1_BoxSubClass_SuperConst obb = new A1_BoxSubClass_SuperConst();
//
//        obb.show();
//        obb.showWeight();




    }
}
