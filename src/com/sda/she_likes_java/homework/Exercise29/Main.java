package com.sda.she_likes_java.homework.Exercise29;

import java.util.Scanner;

import static com.sda.she_likes_java.homework.Exercise29.PostalCodeChecker.checkPostalCode;

public class Main {
    public static void main(String[] args) {
        char mLetter = 'm';
        System.out.println("m letter: " + mLetter);
        int mLetterCode = mLetter;
        System.out.println("m letter code: " + mLetterCode);

        String name = "mariusz";
        System.out.println("First 3 letter: " + name.substring(0,3));


        System.out.println("Lets check postal codes");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter postal code: ");
        String postalCodeValue = scanner.nextLine();

        PostalCode postalCode = new PostalCode(postalCodeValue);

        try {
            checkPostalCode(postalCode);
            System.out.println("Postal code format is correct");
        } catch (PostalCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
