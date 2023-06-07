package com.sda.she_likes_java.homework.exercise31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = (a, b) -> a * b;

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        int result = 0;
        String operation = "";

        // Perform the selected operation based on user's choice
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                operation = "Addition";
                break;
            case 2:
                result = calculator.sub(num1, num2);
                operation = "Subtraction";
                break;
            case 3:
                result = calculator.div(num1, num2);
                operation = "Division";
                break;
            case 4:
                result = calculator.multi(num1, num2);
                operation = "Multiplication";
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.println(operation + ": " + result);

        scanner.close();
    }
}




