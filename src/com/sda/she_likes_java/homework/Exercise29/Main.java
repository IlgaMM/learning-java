package com.sda.she_likes_java.homework.Exercise29;

import java.util.Scanner;

import static com.sda.she_likes_java.homework.Exercise29.PostalCodeChecker.checkPostalCode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter postal code: ");
        String postalCodeValue = scanner.nextLine();

        PostalCode postalCode = new PostalCode(postalCodeValue);

        try {
            checkPostalCode(postalCode);
            System.out.println("Postal code format ir correct");
        } catch (PostalCodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
