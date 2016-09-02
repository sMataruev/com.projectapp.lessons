package com.projectapp.lessons._11_Lambda.A7_LambdaAndException;


import com.projectapp.lessons._6_Exception.A7_ListOfException;

public class A7_Main {
    public static void main(String[] args)throws EmptyArrayExecption {

        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};

        A7_LambdaExcetp excetp = (n) -> { /*или можно написать явно (double []n) ->*/
            double sum = 0;

            if (n.length == 0)
                throw new EmptyArrayExecption();

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;
        };
        System.out.println("Среднее значение в массиве []values = " + excetp.arrFunc(values));

        /**Тут мы спеуиально бросим иссключение*/

        System.out.println(excetp.arrFunc(new double[0]));



    }
}
