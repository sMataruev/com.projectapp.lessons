package _3_ForClassesAndMethods_Detail;


public class A6_CallMethodOfLink {

    int a;
    int b;

    A6_CallMethodOfLink(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void meth(A6_CallMethodOfLink ob) {
        ob.a *= 2;
        ob.b /= 2;
    }


    public static void main(String[] args) {

        A6_CallMethodOfLink obj = new A6_CallMethodOfLink(16, 30);

        System.out.println("a и b до вызова метода: " + obj.a + " " + obj.b);

        obj.meth(obj);
        System.out.println("a и b после вызова метода: " + obj.a + " " + obj.b);




    }
}
