package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {
            human.whoYouAre();
        }
    }

    public void tryToCastHumanToMan(Human maybeWomanOrMan) {

        if (maybeWomanOrMan instanceof Man) {
            // casting / down casting
            // works for the references
            (
                    (Man) maybeWomanOrMan
            ).learnToCleanHouse();

            ((Man) maybeWomanOrMan).learnToCleanHouse();
        }

        if (maybeWomanOrMan instanceof Woman) {
            ((Woman) maybeWomanOrMan).learnJava();
        }
    }
}