package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A2_ReadConsoleLine {
    public static void main(String[] args) throws IOException {

        BufferedReader myreader = new BufferedReader(new InputStreamReader(System.in));
        String string;

        System.out.println("Pres 'quit' for exit ");
        do {
            string = myreader.readLine();
            System.out.print(string);
        } while (!string.equals("quit"));

    }
}
