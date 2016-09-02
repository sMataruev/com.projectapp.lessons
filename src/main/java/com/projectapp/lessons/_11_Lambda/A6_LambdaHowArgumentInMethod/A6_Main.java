package com.projectapp.lessons._11_Lambda.A6_LambdaHowArgumentInMethod;


public class A6_Main {
    public static void main(String[] args) {

        String inStr = "This is lambda";
        String outStr;

        System.out.println("This is first string = " + inStr);

        outStr = A6_LambdaHowArgs.myFuncStr((str) -> str.toUpperCase(), inStr);
        System.out.println("Строка в верхнем регистре " + outStr);


        /************************************************/


        System.out.println();
        System.out.println();
        System.out.println("Удалим все пробелы из строки");

        outStr = A6_LambdaHowArgs.myFuncStr((str) -> {
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) != ' ')) {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println(outStr);


        /**Или можно сделать так*/

        System.out.println();
        System.out.println();

        A6_IMyStrngInterface ref = ((str) -> {
            String result1 = "";

            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) != ' ')) {
                    result1 += str.charAt(i);
                }
            }
            return result1;
        });

        String newMyStr = A6_LambdaHowArgs.myFuncStr(ref, inStr);
        System.out.println("Другой способ");
        System.out.println(newMyStr);


    }
}
