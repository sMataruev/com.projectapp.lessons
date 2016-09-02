package _3_ForClassesAndMethods_Detail;


public class A4_ObjectForParametrInConstructor {

    double width;
    double height;
    double depth;

    A4_ObjectForParametrInConstructor() {
        width = -1;
        height = -1;
        depth = -1;
    }

    A4_ObjectForParametrInConstructor(double len) {
        width = height = depth = len;
    }

    A4_ObjectForParametrInConstructor(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    A4_ObjectForParametrInConstructor(A4_ObjectForParametrInConstructor ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    double vol() {
        return width * height * depth;
    }

    public static void main(String[] args) {

        A4_ObjectForParametrInConstructor box = new A4_ObjectForParametrInConstructor();
        A4_ObjectForParametrInConstructor box2 = new A4_ObjectForParametrInConstructor(5, 5, 5);
        A4_ObjectForParametrInConstructor box3 = new A4_ObjectForParametrInConstructor(2);

        A4_ObjectForParametrInConstructor boxClone = new A4_ObjectForParametrInConstructor(box2);
        double res;

        res = box3.vol();

        System.out.println("Вызов конструктора без параметров = обьем равен = " + box.vol());
        System.out.println("Вызов конструктора с одним параметром = обьем равен = " + res);

        res = box2.vol();

        System.out.println("Вызов конструктора с тремя параметрами = обьем равен = " + res);
        res = boxClone.vol();
        System.out.println("Вызов конструктора принимающего объект в виде аргумента = " + res);

    }
}
