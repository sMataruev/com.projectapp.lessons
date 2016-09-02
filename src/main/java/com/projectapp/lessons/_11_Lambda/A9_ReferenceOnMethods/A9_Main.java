package com.projectapp.lessons._11_Lambda.A9_ReferenceOnMethods;

import static com.projectapp.lessons._11_Lambda.A9_ReferenceOnMethods.A9_StringFunc2.myFunStr;

public class A9_Main {
    public static void main(String[] args) {

        String inStr = "моё лямбда-выражение";
        String outStr;

        outStr = myFunStr(A9_ReferenceOnStaticMethods::myUpper, inStr);

        System.out.println("Исходная строка " + inStr);
        System.out.println("Переделанная строка " + outStr);


    }
}
