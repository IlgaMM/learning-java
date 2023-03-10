package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {
        System.out.println("There are conditions to get in Bouncer Disco");
        System.out.println("Please type in your age: ");
        Scanner input = new Scanner(System.in);
        int yourAge = input.nextInt();
        System.out.println("and your height (cm): ");
        int yourHeight = input.nextInt();
        if (yourAge >= 18) {
            System.out.println("you are good to go");
        } else {
            System.out.println("bye bye!");
        }
        if (yourHeight >= 160) {
            System.out.println("you are good to go");
        } else {
            System.out.println("bye bye!");
        }

    }
}
