package com.projectapp.lessons._10_Generic.A7_GenericConstructors;

/**
 * Конструкторы также могут быть обобщенными, даже если их классы таковыми
 * не являются. Рассмотрим в качестве примера следующую короткую программу:
 */
public class A7_GenericConstr {

    private double value;

    public <T extends Number> A7_GenericConstr(T value) {
        this.value = value.doubleValue();
    }

    public void showValue() {
        System.out.println("value = " + value);
    }


}
