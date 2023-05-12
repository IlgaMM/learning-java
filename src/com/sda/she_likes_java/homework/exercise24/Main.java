package com.sda.she_likes_java.homework.exercise24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnglishLithuanianDictionary dict = new EnglishLithuanianDictionary();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an English word to translate: ");
        String englishWord = scanner.nextLine();
        String lithuanianWord = dict.translate(englishWord);
        System.out.println("The Lithuanian translation is: " + lithuanianWord);
    }
}

