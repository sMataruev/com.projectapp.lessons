package com.projectapp.lessons._9_Java_IO.A1_IO_Streams;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A5_FileInputStream {
    public static void main(String[] args) {


//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("C:\\Users\\Wilkinson\\Desktop\\mytest.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println(fileInputStream +  " Такого файла не существует ");
//        }
//        int a;
//
//        System.out.println("Читаем файлу C:\\Users\\Wilkinson\\Desktop\\mytest.txt");
//
//        try {
//            do {
//                a = fileInputStream.read();
//                if (a != -1) {
//                    System.out.print((char) a + "");
//                }
//
//            } while (a != -1);
//        } catch (IOException e) {
//            System.out.println(fileInputStream +  " Такого файла не существует ");
//        }
//        try {
//            fileInputStream.close();
//        } catch (IOException e) {
//            System.out.println("Не получилось закрыть файл " + fileInputStream);
//
//        }

/****************************************************************************/


//        FileInputStream fin = null;
//        try {
//            fin = new FileInputStream("C:\\Users\\Wilkinson\\Desktop\\mytest.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("Ошибка! такого файла не существует!");
//        }
//        int a;
//
//        try {
//            do {
//                a = fin.read();
//                if (a != -1) {
//                    System.out.print((char) a + "");
//                }
//            } while (a != -1);
//        } catch (IOException e) {
//            System.out.println("Файл не найдем");
//        } finally {
//            try {
//                fin.close();
//            } catch (IOException e) {
//                System.out.println("Ошибка закрытия файла!");
//            }
//        }


    }
}
