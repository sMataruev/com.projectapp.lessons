package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A8_Auto_Try_TwoFiles {
    public static void main(String[] args) {


        int a;
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Wilkinson\\Desktop\\mytest.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Wilkinson\\Desktop\\mytest1.txt")) {

            do {
                a = fileInputStream.read();
                if (a != -1) {
                    fileOutputStream.write(a);
                }
            } while (a != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ВВОДА/ВЫВОДА");
        }
        System.out.println("Программа успешно выплнилвсь!");

    }
}
