package com.projectapp.lessons._11_Lambda.A4_LambdaInBlockWithString;


public class A4_Main {
    public static void main(String[] args) {

        A4_LambdaWithString myUppedStr;


        myUppedStr = (str) -> {
            String result = "";

            for (int i = 0; i < 1; i++) {
                result += str.toUpperCase();
            }
            return result;
        };
        String str2 = myUppedStr.str("hello world");
        System.out.println(str2);


/***********************************************************/

        A4_LambdaWithString myUppedStr2;

        myUppedStr2 = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        String str3 = myUppedStr2.str("Hello world");
        System.out.println(str3);


    }
}
