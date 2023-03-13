package com.sda.she_likes_java.loops.WhileLoop;

public class WhileIGrow {
    public static void main(String[] args) {
        int ageOfTheKid = 1;

        while (ageOfTheKid <= 18) {
            System.out.println("Mommy can I go to disco??");
            System.out.println("no");
            ageOfTheKid++; // nozīmē to pašu ko ageOfTheKid = ageOfTheKid +1
        }

        System.out.println("go party!!");

    }
}
