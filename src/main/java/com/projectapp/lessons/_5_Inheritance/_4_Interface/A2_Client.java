package com.projectapp.lessons._5_Inheritance._4_Interface;


public class A2_Client implements A2_CallOfClient {

    @Override
    public void call(String msg) {
        System.out.println("Вызов из интерфейса A2_CallOfClient с сообщение: " + msg);
    }

}
