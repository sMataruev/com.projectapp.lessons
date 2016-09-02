package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1_ReadConsole {
    public static void main(String[] args) throws IOException {


        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        char c ;

        System.out.println("Press 'q' for exit ");
        do {
            c = (char) myReader.read();
            System.out.print(c);

        }while (c != 'q');


    }
}
