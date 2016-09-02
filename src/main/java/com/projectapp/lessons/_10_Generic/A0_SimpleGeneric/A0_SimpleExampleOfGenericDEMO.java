package com.projectapp.lessons._10_Generic.A0_SimpleGeneric;


public class A0_SimpleExampleOfGenericDEMO {
    public static void main(String[] args) {

        A0_SimpleExampleOfGeneric<Integer> obInt = new A0_SimpleExampleOfGeneric<>(5);
        obInt.show();

        int v = obInt.getOb();

        System.out.println("Values 'v' = " + v);




    }
}
