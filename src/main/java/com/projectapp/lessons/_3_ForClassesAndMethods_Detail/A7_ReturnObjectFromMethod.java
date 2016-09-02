package _3_ForClassesAndMethods_Detail;

/**
 * Метод может возвращать любой тип данных, в том числе и созданные типы классов.
 */
public class A7_ReturnObjectFromMethod {

    int a;

    A7_ReturnObjectFromMethod(int a) {
        this.a = a;
    }
    //Возвращаем объект с увеличенной полем на 10
    A7_ReturnObjectFromMethod method () {
        A7_ReturnObjectFromMethod temp = new A7_ReturnObjectFromMethod(a + 10);
        return temp;
    }


    public static void main(String[] args) {

        A7_ReturnObjectFromMethod objectFromMethod = new A7_ReturnObjectFromMethod(10);
        A7_ReturnObjectFromMethod objectFromMethod1;

        objectFromMethod1 = objectFromMethod.method();
        System.out.println(objectFromMethod.a);
        System.out.println(objectFromMethod1.a);

    }
}
