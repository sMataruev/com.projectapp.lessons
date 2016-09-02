package _2_ForClasses;

/**
 *  В отношении методов важно различать два термина: параметр и аргумент.
 *  Параметр - это определенная в методе переменная , которая принимает заданное
 *  значение при вызове метода.
 *  Аргумент - это значение, передаваемое методу при его вызове.
 */

public class A4_MethodSetValues {

    int mySquare(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        A4_MethodSetValues setValues = new A4_MethodSetValues();

        double c = setValues.mySquare(5);
        System.out.println("mySquare = " + c);


    }
}
