package com.projectapp.lessons._5_Inheritance._4_Interface;

import java.util.Random;

/**
 * В этом примере класс A6_VariableInInterfaceClass реализует интерфецс A6_VariableInInterface
 * в котором определены константы ДНИ НЕДЕЛИ
 * <p>
 * Код из класса ссылается на эти константы так, как если бы они
 * определялись и наследовались непосредственно в каждом классе.
 */

public class A6_VariableInInterfaceClass implements A6_VariableInInterface {

    Random myRand = new Random();

    int ask() {
        int temp = (int) (100 * myRand.nextDouble());
        if (temp < 20)
            return MONDAY;
        else if (temp < 35)
            return TUESDAY;
        else if (temp < 45)
            return WEDNESDAY;
        else if (temp < 55)
            return THURSDAY;
        else if (temp < 65)
            return FRIDAY;
        else if (temp < 85)
            return SATURDAY;
        else if (temp < 95)
            return SUNDAY;
        else
            return NEVER;
    }

    public static void answer(int result) {
        switch (result) {
            case MONDAY:
                System.out.println("В Понедельник");
                break;
            case TUESDAY:
                System.out.println("Во Вторник");
                break;
            case WEDNESDAY:
                System.out.println("В Среду");
                break;
            case THURSDAY:
                System.out.println("В Четверг");
                break;
            case FRIDAY:
                System.out.println("В Пятницу");
                break;
            case SATURDAY:
                System.out.println("В Субботу");
                break;
            case SUNDAY:
                System.out.println("В Воскресенье");
                break;
            default:
                System.out.println("НИКОГДА!");
        }

    }

}


