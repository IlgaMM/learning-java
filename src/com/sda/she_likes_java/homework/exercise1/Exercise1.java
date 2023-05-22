package com.sda.she_likes_java.homework.exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("please write in 3 numbers from 1-10");
        Scanner InputReader = new Scanner(System.in);
        System.out.println("first: ");
        int firstNumber = InputReader.nextInt();
        System.out.println("second: ");
        int secondNumber = InputReader.nextInt();
        System.out.println("third: ");
        int thirdNumber = InputReader.nextInt();
        int sum = getSumOfTwoLargest(firstNumber,secondNumber,thirdNumber);
        System.out.println("Summary of two Largest are: "+sum);

    }
    public static int getSumOfTwoLargest(int firstNumber, int secondNumber, int thirdNumber) {
        int max1 = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        int max2;

        if (firstNumber == max1) {
            max2 = Math.max(secondNumber, thirdNumber);
        } else if (secondNumber == max1) {
            max2 = Math.max(firstNumber, thirdNumber);
        } else {
            max2 = Math.max(firstNumber, secondNumber);
        }

        return max1 + max2;
    }

        }
