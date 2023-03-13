package com.sda.she_likes_java.functions;

public class FunctionsFirstExample {
    public static void main(String[] args) {
        //funkcija- koda daļa, kuru var piesaukt vairākas reizes
        //it's a piece of tje code which I can call many times
        //function features
        //has name - just before opening bracket like "main"
        //has parameters - inside brackets (): String [] args
        //has return value - type name before name of the function e.g. void (pagaidām neskaidrojam)
        //we call function by its name
        //void means - no return
        printMyName();

        System.out.println();
        System.out.println("After call...");
        System.out.println();

        printMyName();
    }

    //it's function
    public static void printMyName() {

        int numberOfTimes = 10;
        while (numberOfTimes > 0) {
            System.out.println("Hi, I'm Ilga");
            numberOfTimes--;
        }
    }

}
