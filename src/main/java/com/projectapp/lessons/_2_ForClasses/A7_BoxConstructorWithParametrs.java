package _2_ForClasses;

/**
 * Ключевое слово this требуется, чтобы метод ссылался на вызвавший его объект.
 * Также когда скажем в конструкторе совпадают параметры с именами полей тогоже класса,
 * чтобы не было перекрытие, нужно указать слово THIS
 */

public class A7_BoxConstructorWithParametrs {

    double width;
    double height;
    double depth;

    A7_BoxConstructorWithParametrs(double a, double b, double c) {
        System.out.println("Создаем обьект класса A7_Box...");
        width = a;
        height = b;
        depth = c;
    }

    double vol() {
        return width * height * depth;
    }


    public static void main(String[] args) {

        A7_BoxConstructorWithParametrs box = new A7_BoxConstructorWithParametrs(5, 5, 5);
        double res = box.vol();

        System.out.println("Обьем равен = " + res);

    }
}
