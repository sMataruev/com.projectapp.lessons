package com.projectapp.lessons._6_Exception;

/** Применение нескольких операторов catch
 Иногда в одном фрагменте кода может возникнуть не одно исключение. Чтобы
 справиться с такой ситуацией, можно указать два или больше оператора саtch,
 каждый из которых предназначается для перехвата отдельного типа исключения.
 */


public class A2_Exception {
    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println(" a = " + a);
            int b = 45 / a;

            int[] c = {1};
            c[42] = 99;

        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на ноль!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Переполнение массива!");
        }
        System.out.println("После оператора try/catch");

/********************************************************************/

        /**Применяя несколько операторов catch, важно помнить, что перехват исключений
        из подклассов должен следовать до перехвата исключений из суперклассов.
        Дело в том, что оператор саtch, в котором перехватывается исключение из суперкласса,
        будет перехватывать все исключения из этого суперкласса, а также все исключения
        из его подклассов. Это означает, что исключения из подкласса вообще
        не будут обработаны */


//        try {
//            int a = args.length;
//            System.out.println(" a = " + a);
//            int b = 45 / a;
//
//            int[] c = {1};
//            c[42] = 99;
//
//        } catch (Exception e) {
//            System.out.println("Нельзя делить на ноль!");
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Переполнение массива!");
//        }
//        System.out.println("После оператора try/catch");

        /** 2-й оператор catch недостижим! это ошибка, такого быть недолжно! */




    }
}
