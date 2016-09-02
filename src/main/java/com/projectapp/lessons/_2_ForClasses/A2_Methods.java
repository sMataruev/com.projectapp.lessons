package _2_ForClasses;

/**
 * Синтаксис метода - Тип Имя (Список параметров) {
 * тело метода...
 * }
 * 1) Тип данных, возвращаемых методом, должен быть совместим с возвращаемым
 * типом , указанным в методе. Если какой-нибудь метод должен возвращать
 * логический тип boolean, то возвратить из него целочисленное значение нельзя.
 *
 * 2) Переменная , принимающая возвращаемое методом значение (например,
 * vol ), также должна быть совместима с возвращаемым типом, указанным
 * для метода.
 */

public class A2_Methods {

    int width;
    int height;
    int depth;

    public void vol () {
        System.out.print("Обьем равен = ");
        System.out.println(width * height * depth);
    }

    public static void main(String[] args) {

        A2_Methods box = new A2_Methods();
        A2_Methods box2 = new A2_Methods();

        box.width = 100;
        box.height = 50;
        box.depth = 30;

        box2.width = 110;
        box2.height = 80;
        box2.depth = 50;

        box.vol();
        box2.vol();



    }
}
