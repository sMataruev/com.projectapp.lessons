package com.projectapp.lessons._5_Inheritance._2_OverrideMethod;


public class Main {
    public static void main(String[] args) {
//
//        A1_A ob = new A1_A(1, 2);
//        A1_B obb = new A1_B(1, 2, 3);
//
//        ob.show();
//        obb.show();


//        A2_A a2_a = new A2_A(1, 2);
//        A2_B a2_b = new A2_B(1, 2, "one and two");

        //два этих метода выведут один резултьтат, так как он ПЕРЕГРУЖЕН, компилятор вызовет тот метод
        //которые подходит по ситуации. В данном случае отработает метод БЕЗ ПАРАМЕТРОВ
//        a2_a.show();
//        a2_b.show();

        //Здесь мы указали какой вариант ПЕРЕГРУЖЕННОГО метода вызвать, а именно с одним параметро
//        a2_b.show("Hello");

/*****************************************************/

//        A3_DispatcherMethods a3 = new A3_DispatcherMethods();
//        A3_A_DispatcherMethods a3_a = new A3_A_DispatcherMethods();
//        A3_B_DispatcherMethods a3_b = new A3_B_DispatcherMethods();
//
//        A3_DispatcherMethods link;

//        a3.show();
//        a3_a.show();
//        a3_b.show();
//
//        System.out.println("\n**************\n");
//
//        link = a3_a;
//        link.show();
//
//        link = a3_b;
//        link.show();



/*****************************************************/

        A4_Figur figur = new A4_Figur(10, 10);
        A4_Rectangle rectangle = new A4_Rectangle(14, 18);
        A4_Triangle triangle = new A4_Triangle(8, 12);

        A4_Figur ref;

        ref = rectangle;
        System.out.println("Rectangle " + ref.showArea());

        ref = triangle;
        System.out.println("Triangle " + ref.showArea());

        ref = figur;
        System.out.println("Figure " + ref.showArea());


    }
}
