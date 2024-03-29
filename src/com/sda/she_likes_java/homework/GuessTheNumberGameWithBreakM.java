package com.sda.she_likes_java.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWithBreakM {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 8;
        //   System.out.println("random number provided by Java:" + someRandomNumber);

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Play game with me!");
        System.out.println("Guess a number between 1 and 20");
        int userAnswer;
        do {
            userAnswer = inputReader.nextInt();
            numberOfTrials--;

            if (userAnswer == someRandomNumber) {
                System.out.println("Great, You win!");

            } else if (numberOfTrials <= 0) {
                System.out.println("You have no more attempts");
                break;
            }

        }
        while (userAnswer != someRandomNumber);

    }
}
