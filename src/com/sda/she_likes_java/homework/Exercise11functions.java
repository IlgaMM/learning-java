package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Exercise11functions {
    public static void main(String[] args) {
        System.out.println("Ready to PARTY?");
        youngBouncer();

        System.out.println("good luck next time");
        System.out.println();
        oldBouncer();
    }
    public static void youngBouncer() {

        System.out.println("Check out your ability to get in by typing in your age");
        Scanner inputReader = new Scanner(System.in);
        String declineTxt = "my eyesight is not so good anymore, but I think You ar good to go, have a great party ";
        int age = inputReader.nextInt();

        System.out.println("Let me know Your height now: ");
        int height = inputReader.nextInt();

        System.out.println("Can you sing?");
        String canSing = inputReader.next().toLowerCase();

        boolean answer;
        if (canSing.equals("yes")) {
            answer = true;
        } else if (canSing.equals("no")) {
            answer = false;
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            return;
        }

        boolean canEnterTheParty = age >= 18 && height >= 180 && answer == true;

        if (canEnterTheParty) {
            System.out.println("Have a great party!");
        } else {
            return;
        }
    }
    public static void oldBouncer() {

        System.out.println("Check out your ability to get in by typing in your age");
        Scanner inputReader = new Scanner(System.in);
        int age = inputReader.nextInt();

        System.out.println("Let me know Your height now: ");
        int height = inputReader.nextInt();

        System.out.println("Can you sing?");
        String canSing = inputReader.next().toLowerCase();

        boolean answer;
        if (canSing.equals("yes")) {
            answer = true;
        } else if (canSing.equals("no")) {
            answer = false;
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            return;
        }

        boolean canEnterTheParty = age >= 18 || height > 180 || answer == true;;

        if (canEnterTheParty) {
            System.out.println("my eyesight is not so good anymore, but I think You ar good to go, have a great party");
        } else {
            System.out.println("Go Home its not your time to shine yet");
            return;
        }
    }
}
