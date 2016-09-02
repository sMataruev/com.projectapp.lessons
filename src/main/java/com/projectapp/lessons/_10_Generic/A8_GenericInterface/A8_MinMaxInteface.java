package com.projectapp.lessons._10_Generic.A8_GenericInterface;

/**
 * Помимо классов и методов, обобщенными можно объявлять интерфейсы.
 * Обобщенные интерфейсы объявляются таким же образом, как и обобщенные
 * классы
 */
public interface A8_MinMaxInteface<T extends Comparable<T>> {

    public T min();

    public T max();

}
