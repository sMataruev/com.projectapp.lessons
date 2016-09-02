package com.projectapp.lessons._5_Inheritance._4_Interface;

/**
 * Created by Wilkinson on 10.07.2016.
 * Интерфейсы можно применять для импорта совместно используемых констант
 * в несколько классов пугем простого объявления интерфейса, который содержит
 * переменные, инициализированные нужными значениями.
 * <p>
 * Если интерфейс не содержит никаких методов, любой класс, включающий в себя такой интерфейс,
 * на самом деле ничего не реализует.
 *
 * СМОТРИ ПРИМЕР В A6_VariableInInterfaceClass
 */
public interface A6_VariableInInterface {
    int MONDAY = 1;
    int TUESDAY = 2;
    int WEDNESDAY = 3;
    int THURSDAY = 4;
    int FRIDAY = 5;
    int SATURDAY = 6;
    int SUNDAY = 7;
    int NEVER = 8;
}
