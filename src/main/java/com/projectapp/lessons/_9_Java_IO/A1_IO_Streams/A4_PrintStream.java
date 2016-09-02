package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.PrintStream;
import java.io.PrintWriter;

public class A4_PrintStream {
    public static void main(String[] args) {


        PrintStream pw = new PrintStream(System.out, true);
        String str = "This is my sting";
        pw.print(str);
        System.out.println();

        double a = 5;
        double b = 17;
        double c = a / b;

        pw.print(c);
        System.out.println();



    }
}
