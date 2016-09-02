package com.projectapp.lessons._10_Generic.A11_OverrideGeneriMethods;


public class A11_Main {
    public static void main(String[] args) {


        A11_OverMethod<Integer> overMethod = new A11_OverMethod<>(50);
        A11_OverMethod_2<Integer> overMethod_2 = new A11_OverMethod_2<>(90);
        A11_OverMethod_2<String> stringA11_overMethod_2 = new A11_OverMethod_2<>("Привет");

        System.out.println(overMethod.getValue() + " ");
        System.out.println(overMethod_2.getValue() + " ");
        System.out.println(stringA11_overMethod_2.getValue() + " ");

    }
}
