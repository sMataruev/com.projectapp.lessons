package com.projectapp.lessons._11_Lambda.A11_TemperatureExample;

import static com.projectapp.lessons._11_Lambda.A11_TemperatureExample.A11_ObjectRefExample.counter;

public class A11_Main {
    public static void main(String[] args) {

        int count;

        A11_HightTemp[] weekDaysTemp = {
                new A11_HightTemp(54),
                new A11_HightTemp(24),
                new A11_HightTemp(54),
                new A11_HightTemp(22),
                new A11_HightTemp(54),
        };

        count = counter(weekDaysTemp, A11_HightTemp::HighTempFun, new A11_HightTemp(54));
        System.out.println("Максимальная темпаратура держалась " + count + " дня " + "в этом месяце");


        /********************************************/


        A11_HightTemp[] weekDaysTemp2 = {
                new A11_HightTemp(32),
                new A11_HightTemp(22),
                new A11_HightTemp(12),
                new A11_HightTemp(-1),
                new A11_HightTemp(21),
                new A11_HightTemp(17),
        };

        int count2;

        count2 = counter(weekDaysTemp2, A11_HightTemp::lessThanTemp, new A11_HightTemp(54));
        System.out.println("Сколько дней температура была меньше максимальной " +  count2);


    }
}
