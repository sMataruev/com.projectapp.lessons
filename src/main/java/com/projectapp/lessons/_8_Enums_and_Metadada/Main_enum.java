package com.projectapp.lessons._8_Enums_and_Metadada;


public class Main_enum {


    public static void main(String[] args) {


//        A1_FirsEnums day;
//        A1_FirsEnums key = null;
//        day = A1_FirsEnums.MONDAY;


        /*их можно сравнивать на равенство! переменной day было присвоенно сначение MONDAY
         теперь переменную day можно сравнить с любой константой из соответствующего класса
        */

//        if (day == A1_FirsEnums.MONDAY) {
//            System.out.println("Переменная " + day + " равна константе " + A1_FirsEnums.MONDAY + " = TRUE");
//        } else {
//            System.out.println("Переменная " + day + " НЕ равна константе " + A1_FirsEnums.MONDAY + " = FALSE");
//        }


/****************************************************************/


        /* Их так же можно использовать в операторе SWITCH при этом ключ принимаеный Switch должен быть
        таким же типом что и константы которые использкешь в switch'е

         СДЕЛАЙ ЗАДАНИЕ: ДНИ НЕДЕЛИ НА РУССКОМ ЯЗЫКЕ С ПРОГНОЗОМ ПОГОДЫ
         нажимыем цифру 1 показывает Понедельник и погоду на день и тд...
         */

/****************************************************************/

        /*Перечисления автоматически включают в себя два предопределенных метода:
        values() и valueOf().
        Метод values()  возвращает массив, содержащий список констант перечислимого типа.

        А метод valueOf() возвращает константу перечислимого типа, значение
        которой соответствует символьной строке, переданной в качестве аргумента
        строка.*/

        //Пример valueOf()
//        A1_FirsEnums day2 = A1_FirsEnums.valueOf("MONDAY");
//        System.out.println(day2);


        //Пример values()
//        A1_FirsEnums[] ref = A1_FirsEnums.values();
//        for (A1_FirsEnums x : ref) {
//            System.out.println("День недели: " + x);
//        }

        //или так
//        for (A1_FirsEnums allDays : A1_FirsEnums.values()) {
//            System.out.println("День недели: " + allDays);
//        }


/****************************************************************/

//        A2_Enums_DayOfWeek dayOfWeek;
//
//        System.out.println("Значение " + A2_Enums_DayOfWeek.MONDAY + ": " + A2_Enums_DayOfWeek.MONDAY.getDays());
//        System.out.println("Значение " + A2_Enums_DayOfWeek.TUESDAY + ": " + A2_Enums_DayOfWeek.TUESDAY.getDays());
//        System.out.println("Значение " + A2_Enums_DayOfWeek.SATURDAY + ": " + A2_Enums_DayOfWeek.SATURDAY.getDays());

        //Сделай тоже самое только в цикле!

//        A2_Enums_DayOfWeek[] arrayDays = A2_Enums_DayOfWeek.values();
//
//        for (int i = 0; i < arrayDays.length; i++) {
//            System.out.println(arrayDays[i] + " - " + arrayDays[i].getDays());
//        }


/****************************************************************/

        /*метод ordinal(), можно получить значение, которое обозначает позицию
        константы в списке констант перечислимого типа
        */
//        System.out.println(A2_Enums_DayOfWeek.SATURDAY.ordinal());





        /*С помощью метода compareTo() можно сравнить порядковые значения двух
        констант одного и того же перечислимого типа.*/

//        int bul = A2_Enums_DayOfWeek.MONDAY.compareTo(A2_Enums_DayOfWeek.FRIDAY);
//        if (bul == 0) {
//            System.out.println("TRUE");
//        } else {
//            System.out.println("FALSE");
//        }

//        if (A2_Enums_DayOfWeek.MONDAY.compareTo(A2_Enums_DayOfWeek.WEDNESDAY) < 0) {
//            System.out.println("MONDAY меньше WEDNESDAY");
//        } else if (A2_Enums_DayOfWeek.MONDAY.compareTo(A2_Enums_DayOfWeek.WEDNESDAY) == 0) {
//            System.out.println("MONDAY равно WEDNESDAY ");
//        } else if (A2_Enums_DayOfWeek.MONDAY.compareTo(A2_Enums_DayOfWeek.WEDNESDAY) > 0) {
//            System.out.println("MONDAY больше WEDNESDAY");
//        }


/****************************************************************/


/****************************************************************/


/****************************************************************/


    }
}
