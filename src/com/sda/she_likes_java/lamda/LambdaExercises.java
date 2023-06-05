package com.sda.she_likes_java.lamda;

public class LambdaExercises {
    public static void main(String[] args) {
        Jogging slowMan = new SlowRunner();
        Jogging fastRunner = new FastRunner();
        justRun(slowMan);
        justRun(fastRunner);

        //anonymous classes - till java 7
        Jogging middleOne = new Jogging() {
            @Override
            public void run() {
                System.out.println("Running in the middle:) ");

            }
        };

        Jogging firstLambda = () -> {
        };
        Jogging secondLambda = () -> {
            System.out.println("Run from Lambda");
        };
        secondLambda.run();
        justRun(() -> {
            System.out.println("in place:)");
        });

        Walker jonny = () -> {
        };

        Adder longVersion = (int first, int second) -> {
            return first + second;
        };

        // just names of parameters, without types
        Adder shorterVersion = (first, second) -> {
            return first + second;
        };

        Adder compactVersion = (first, second) -> first + second;
        compactVersion.addTwoNumbers(1, 5);

        Adder compactVersionWithManyInstructions = (first, second) -> {
            System.out.println("Performing operations...");
            return first + second;
        };
        compactVersionWithManyInstructions.addTwoNumbers(4, 4);
    }

    public static void justRun(Jogging runner) {
        runner.run();
    }
}