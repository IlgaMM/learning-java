package com.sda.she_likes_java.strings;

public class StringsExample {
    public static void main(String[] args) {
        String name = "Ilga";
        String surname = "Miezaine-Mustermane";
        int age = 35;

        // Hi, I'm (name) (surname). I am (age) old
        System.out.println("Hi, I'm " + name + " " + surname +". I am " + age + " old.");
        // %s means String wildcard
        // %d means number wildcard
        System.out.printf("Hi, I'm %s %s. I am %d years old.%n",name, surname, age);
        System.out.printf("Hi, I'm %s %s. I am %d old.%n", name, surname, age);
    }
}
