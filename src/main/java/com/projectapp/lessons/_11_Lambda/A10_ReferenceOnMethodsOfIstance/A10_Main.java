package com.projectapp.lessons._11_Lambda.A10_ReferenceOnMethodsOfIstance;

import static com.projectapp.lessons._11_Lambda.A10_ReferenceOnMethodsOfIstance.A10_StringFunc2.myFunStr;

public class A10_Main {
    public static void main(String[] args) {

        A10_ReferenceOnStaticMethods myNewStr = new A10_ReferenceOnStaticMethods();

        String inStr = "моё лямбда-выражениее";
        String outStr;

        outStr = myFunStr(myNewStr::myUpper, inStr);

        System.out.println("Исходная строка " + inStr);
        System.out.println("Переделанная строка " + outStr);


    }
}
