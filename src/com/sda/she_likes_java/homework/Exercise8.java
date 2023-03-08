package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println("Calculator");
        System.out.println("Enter first number: ");
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("Enter second number: ");
        b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum is: " + sum);
        int sub = a - b;
        System.out.println("Sub is: " + sub);
        int multi = a * b;
        System.out.println("Multiplication is: " + multi);
        double div = (double) a / b;
        System.out.println("Division is: " + div);


    }
}
