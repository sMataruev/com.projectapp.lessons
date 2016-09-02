package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A6_FileOutputStream {
    public static void main(String[] args) throws FileNotFoundException {

        int a;
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Wilkinson\\Desktop\\mytest.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Wilkinson\\Desktop\\myOutputFile.doc");


        try {
            do {
                a = fileInputStream.read();
                if (a != -1) {
                    fileOutputStream.write(a);
                }
            } while (a != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода");
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла!");
            }
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла!");
            }
            System.out.println("Программа успещно выполнена!");
        }


    }
}
