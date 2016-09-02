package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A3_EasyEditor {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];

        System.out.println("Enter your text");
        System.out.println("Press 'stop' for exit ");

        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
            if(str[i].equals("stop"))
                break;
        }
        System.out.println("Your text");
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);

        }
    }
}
