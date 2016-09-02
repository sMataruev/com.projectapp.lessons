package com.projectapp.lessons._6_Exception;

/**
 *
 */
public class A1_Exception {

    public int myFun (int a, int b) {
        return a / b;
    }


    public static void main(String[] args) {

//        A1_Exception first = new A1_Exception();
//
//        int c = first.myFun(10, 0);
//        System.out.println(c);


        //тут мы перехватываем исключение и обрабатываем её

//        try {
//            int v = first.myFun(10, 0);
//            System.out.println(c);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("После оператора catch");


/***********************************************/

//        Random count = new Random();
//        int c = 0;
//        for (int i = 0; i < 10; i++) {
//            int a = count.nextInt();
//            int b = count.nextInt();
//
//            try {
//                c = 12345 / (a / b);
//                System.out.println(c);
//            } catch (Exception e) {
//                System.out.println("Делене на ноль!");
//                c = 0;
//            }
//        }
//        System.out.println("\n\nПеременной С присвоен ноль " + c);
    }
}
