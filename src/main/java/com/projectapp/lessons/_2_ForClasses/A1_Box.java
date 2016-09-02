package com.projectapp.lessons._2_ForClasses;

/**
 * Это простой класс.
 * Класс определяет НОВЫЙ тип данных!
 * Класс это каркас/чертеж для будущих объектов
 * слово BOX будет использоваться для обьявления объектов типа BOX - Вох mybox = new Вох ();
 * Обращение к данным проходит черех оператор точка (.)
 * Каждый экземпляр объекта будет иметь свои собственные капии данных (полей)
 * Изменение данных в одном экземпляре не влияет на данные в другом экземпляре одного типа.
 * Можно присвоить переменной ссылку на объект, одного и того же класса - box2 = box1;
 */
public class A1_Box {
    int width;
    int height;
    int depth;

    public static void main(String[] args) {
        A1_Box box = new A1_Box();
        A1_Box box1 = new A1_Box();

        box.width = 100;
        box.height = 50;
        box.depth = 30;

        box1.width = 120;
        box1.height = 70;
        box1.depth = 50;

        double vol = box.width * box.height * box.depth;
        System.out.println("Обьем равен = " + vol);

//      Перещет для другого объекта
        vol = box1.width * box1.height * box1.depth;
        System.out.println("Обьем равен = " + vol);

    }


}

