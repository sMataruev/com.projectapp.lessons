package _3_ForClassesAndMethods_Detail;


public class A3_ObjectForParametrInMethods {

    int a;//10
    int b;//10

    A3_ObjectForParametrInMethods(int a, int b) {
        this.a = a;
        this.b = b;
    }



    boolean myEquals(A3_ObjectForParametrInMethods ob2) {

        System.out.println("Это мой метод myEquals");

        if (ob2.a == this.a && ob2.b == this.b) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        A3_ObjectForParametrInMethods ob = new A3_ObjectForParametrInMethods(10, 10);
        A3_ObjectForParametrInMethods ob_1 = new A3_ObjectForParametrInMethods(10, 10);

        A3_ObjectForParametrInMethods ob2 = new A3_ObjectForParametrInMethods(5, 10);
        A3_ObjectForParametrInMethods ob3 = new A3_ObjectForParametrInMethods(5, 5);

        System.out.println("ob == ob2: " + ob.myEquals(ob2));
//        System.out.println("ob2 == ob3: " + ob2.myEquals(ob3));
//        System.out.println("ob2 == ob_1: " + ob.myEquals(ob_1));




    }
}
