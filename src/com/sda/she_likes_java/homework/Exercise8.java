package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Enter first number: ");
        int Num1;
        int Num2;
        Scanner input = new Scanner(System.in);
        Num1 = input.nextInt();
        System.out.println("Enter second number: ");
        Num2 = input.nextInt();
        int sum = Num1 + Num2;
        System.out.println("Sum is: " + sum);
        int sub = Num1 - Num2;
        System.out.println("Sub is: " + sub);
        int multi = Num1 * Num2;
        System.out.println("Multiplication is: " + multi);
        double div = (double) Num1 / Num2;
        System.out.println("Division is: " + div);


    }
}
