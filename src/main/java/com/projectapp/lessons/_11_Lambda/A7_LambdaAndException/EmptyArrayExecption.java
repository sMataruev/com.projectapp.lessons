package com.projectapp.lessons._11_Lambda.A7_LambdaAndException;


class EmptyArrayExecption extends Exception {
    public EmptyArrayExecption() {
        super("Массив пуст!");
    }
}
