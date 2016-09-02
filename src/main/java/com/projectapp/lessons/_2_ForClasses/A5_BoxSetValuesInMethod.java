package _2_ForClasses;


public class A5_BoxSetValuesInMethod {

//    int width;
//    int height;
//    int depth;

    double vol(int a, int b, int c) {
        return a * b * c;
    }


    public static void main(String[] args) {

        A5_BoxSetValuesInMethod box = new A5_BoxSetValuesInMethod();
        A5_BoxSetValuesInMethod box2 = new A5_BoxSetValuesInMethod();
        double res;

        res = box.vol(5, 5, 5);
        System.out.println("Обьем равен = " + res);

        res = box2.vol(5, 6, 7);
        System.out.println("Обьем равен = " + res);



    }
}
