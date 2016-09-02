package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A7_Auto_Try {
    public static void main(String[] args) {


        int a;

        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Wilkinson\\Desktop\\mytest.txt")) {
            do {
                a = fileInputStream.read();
                if (a != -1) {
                    System.out.print((char) a + "");
                }
            } while (a != -1);
        } catch (FileNotFoundException i) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода");
        }
        System.out.println("\nПрограмма успешно выполнилась!");


    }
}
