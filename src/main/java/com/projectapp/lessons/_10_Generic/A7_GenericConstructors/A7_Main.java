package com.projectapp.lessons._10_Generic.A7_GenericConstructors;


public class A7_Main {
    public static void main(String[] args) {

        A7_GenericConstr constrI = new A7_GenericConstr(50);
        A7_GenericConstr constrF = new A7_GenericConstr(100500F);
        A7_GenericConstr constrD = new A7_GenericConstr(1000.0D);

        constrI.showValue();
        constrF.showValue();
        constrD.showValue();


    }
}
