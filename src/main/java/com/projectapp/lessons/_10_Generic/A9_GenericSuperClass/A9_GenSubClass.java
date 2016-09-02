package com.projectapp.lessons._10_Generic.A9_GenericSuperClass;


/**
 * Если подклассу нужно установить тип параметра для себя, тогда нужно сделать так
 * <T,V>
 * <T -это для супер класса, V -это для подкласса>
 *
 */
public class A9_GenSubClass<T, V> extends A9_GenSuperClass<T> {

    V value;

    public A9_GenSubClass(T value, V value1) {
        super(value);
        this.value = value1;
    }


    public V getValue2() {
        return value;
    }
}
