package com.projectapp.lessons._6_Exception;

/**
 * Все эти классы подклассы RuntimeException кдасса
 * Это список исключений которые ты должен знать НО они UNCHECKED - не проверяемые!
 *
 * ArithmeticException -Арифметическая ошибка (нап ример, деление на нуль)
 * ArrayindexOutOfВoundsException - Выход индекса за пределы массива
 * ArrayStoreException - Присваивание элементу массива объекта несовместимого типа
 * ClassCastException - Неверное приведение типов
 * EnumConstantNotPresentException - Попытка воспользоваться неопределенным значением перечисления
 * IllegalArgumentException - Употребление недопустимого аргумента при вызове метода
 * IllegalМonitorStateException - Недопустимая контрольная операция ( например, ожидание незаблокированного потока и сполнения)
 * IllegalStateException - Неверное состояние среды или пр􀛐ожения
 * IllegalThreadS tateException - Несовместимость запраш иваемой операции с текушим состоянием потока исполнения
 * IndexOutOfВoundsException - Выход индекса некоторого типа за   допустимые пределы
 * NegativeArraySizeException - Создание массива отрицательного размера
 * NullPointerException - Неверное использование пустой ссылки
 * NwnЬerFormatException - Неверное преобразование символьной строки в числовой формат
 * SecurityException - Попытка нарушения безопасности
 * StringindexOutOfBounds - Попытка индексации за пределами символьной строки
 * ТypeNotPresentException - Тип не найден
 * UnsupportedOperationException - Обнаружена неподдерживаемая операция
 */

/**
 * Все эти классы наследники Exception класса
 * Это список проверяемых исключений CHECKED эти исключения ты должен либо проверять явно в операторе
 * try/catch/finally либо ты должен пробрасывать исключение вверъ по коду!
 * В общем что-то с ними сделать, проигнорировать их неполучиться.
 * Будет ошибка компиляции!
 *
 *
 * ClassNotFoundException - Класс не найден
 * CloneNotSupportedException - Попьrrка клонировать объект из класса, не реализующего интерфейс Cloneable
 * IllegalAccessException - Доступ к классу не разрешен
 * InstantiationException - Попытка создать объект абстрактного класса или интерфейса
 * InterruptedException - Один поток исполнения прерван другим потоком
 * NoSuchFieldException - Запрашиваемое поле не существует
 * NoSuchMethodException - Запрашиваемый метод не существует
 * ReflectiveOperationException - Суперкласс исключений, связанных с рефлексией
 */

public class A7_ListOfException{}
