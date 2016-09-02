package _2_ForClasses;


public class A6_BoxConstructor {

    double width;
    double height;
    double depth;

    A6_BoxConstructor () {
        System.out.println("Создаем обьект класса A6_Box...");
        width = 5;
        height = 5;
        depth = 5;
    }

    double vol() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        A6_BoxConstructor box = new A6_BoxConstructor();
        double res = box.vol();
        System.out.println("Обьем равен = " + res);


    }
}
