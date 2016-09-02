package _3_ForClassesAndMethods_Detail;

/**
 * В Java есть механизм под названием ПЕРЕГРУЗКА МЕТОДОВ.
 * Возможность эту нам дает ПОЛИМОРФИЗМ
 * Более конкретный вид полиморфизма для переопределению методов называется - Ad-hoc Polymorphism
 * Для перегрузки, методы, должны отличаться друго от друга ПАРАМЕТРАМИ и/или ВОЗВРАЩАЕМЫМИ ТИПАМИ
 * но, отличие только одних ВОЗВРАЩАЕМЫХ ТИПОВ мало для того чтобы перегрузить метод.
 */

public class A1_OverloadMethods {

    void test() {
        System.out.println("Вызван test без параметров");
    }

    void test(int a) {
        System.out.println("Вызван test с параметро = " + a);
    }

    void test(int a, int b) {
        System.out.println("Вызван test с двумя параметрами = " + a + " " + b);
    }

    double test(double a) {
        System.out.println("Вызван test с возвращаемым параметром = " + a);
        return a;
    }

    int test(int a, double c) {
        return a;
    }


    public static void main(String[] args) {

        A1_OverloadMethods ob = new A1_OverloadMethods();

        ob.test();
        ob.test(5);
        ob.test(1, 2);

        double a = ob.test(5.0);
        System.out.print(a);


    }
}
