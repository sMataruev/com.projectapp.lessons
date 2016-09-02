package com.projectapp.lessons._11_Lambda.A13_ArrayListExampleFindMaxElement;


import java.util.ArrayList;
import java.util.Collections;

public class A13_Main {
    public static void main(String[] args) {

        ArrayList<A13_MyClass> myList = new ArrayList<>();

        myList.add(new A13_MyClass(1));
        myList.add(new A13_MyClass(11));
        myList.add(new A13_MyClass(12));
        myList.add(new A13_MyClass(16));
        myList.add(new A13_MyClass(4));
        myList.add(new A13_MyClass(6));
        myList.add(new A13_MyClass(3));
        myList.add(new A13_MyClass(25));
        myList.add(new A13_MyClass(13));
        myList.add(new A13_MyClass(7));
        myList.add(new A13_MyClass(2));


        A13_MyClass myMaxVal = Collections.max(myList, A13_MyComparatorMethod::myCompare);
        A13_MyClass myMinVal = Collections.min(myList, A13_MyComparatorMethod::myCompare);

        System.out.println(myMaxVal.getValue());
        System.out.println(myMinVal.getValue());


    }
}
