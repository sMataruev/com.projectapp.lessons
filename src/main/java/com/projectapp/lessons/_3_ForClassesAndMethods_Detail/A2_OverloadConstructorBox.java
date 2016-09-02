package _3_ForClassesAndMethods_Detail;


public class A2_OverloadConstructorBox {

    double width;
    double height;
    double depth;

    A2_OverloadConstructorBox(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    A2_OverloadConstructorBox() {
        width = -1;
        height = -1;
        depth = -1;
    }

    A2_OverloadConstructorBox(double len) {
        width = height = depth = len;
    }

    double vol() {
        return width * height * depth;
    }


    public static void main(String[] args) {


        A2_OverloadConstructorBox box = new A2_OverloadConstructorBox();
        A2_OverloadConstructorBox box2 = new A2_OverloadConstructorBox(10);
        A2_OverloadConstructorBox box3 = new A2_OverloadConstructorBox(10, 15, 50);
        double res = box3.vol();

        System.out.println("Вызов конструктора без параметров = обьем равен = " + box.vol());
        System.out.println("Вызов конструктора с одним параметром = обьем равен = " + box2.vol());
        System.out.println("Вызов конструктора с тремя параметрами = обьем равен = " + res);


    }

}
