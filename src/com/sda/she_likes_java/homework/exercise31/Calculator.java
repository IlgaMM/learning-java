package com.sda.she_likes_java.homework.exercise31;
@FunctionalInterface
public interface Calculator {
    default int add(int a, int b) {
        return a + b;
    }

    default int sub(int a, int b) {
        return a - b;
    }

    default int div(int a, int b) {
        return a / b;
    }

    int multi(int a, int b);
}

