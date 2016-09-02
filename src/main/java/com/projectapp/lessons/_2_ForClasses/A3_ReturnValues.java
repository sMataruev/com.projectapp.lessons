package _2_ForClasses;


public class A3_ReturnValues {

    int width;
    int height;
    int depth;

    public double vol() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        A3_ReturnValues box = new A3_ReturnValues();
        A3_ReturnValues box2 = new A3_ReturnValues();

        box.width = 100;
        box.height = 50;
        box.depth = 30;
        double res = 0;

        box2.width = 110;
        box2.height = 80;
        box2.depth = 50;

        res = box.vol();
        System.out.println("Обьем равен = " + res);
//        или можно сделать так
//        System.out.println(box.vol());

        res = box2.vol();
        System.out.println("Обьем равен = " + res);


    }

}
