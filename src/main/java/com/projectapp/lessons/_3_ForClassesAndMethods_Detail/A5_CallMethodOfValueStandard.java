package _3_ForClassesAndMethods_Detail;


public class A5_CallMethodOfValueStandard {

    void meth(int a, int b) {
        a *= 2;
        b /= 2;
    }

    public static void main(String[] args) {

        A5_CallMethodOfValueStandard ob = new A5_CallMethodOfValueStandard();
        int a = 16;
        int b = 10;

        System.out.println("a и b до вызова метода: " + a + " " + b);

        ob.meth(a, b);
        System.out.println("a и b после вызова метода: " + a + " " + b);



    }
}
