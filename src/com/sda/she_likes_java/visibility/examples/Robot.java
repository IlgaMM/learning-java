package com.sda.she_likes_java.visibility.examples;

public class Robot {
    private final String model;
    private final String generation;
    private int xPosition;
    private int yPosition;

    public Robot(String model, String generation, int xPosition, int yPosition) {
        this.model = model;
        this.generation = generation;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public String createJavaProgram() {
        return """
                public class RoboJavaProgram{
                 public static void main()  {
                 }
           
                }
                """;

    }

    private void doInternalTwiks() {
        System.out.println("very important stuff");
    }
    public void moveForward(){
       xPosition++;
        System.out.println("I'm moving forward");
    }
    public void moveBackward() {
        yPosition--;
        System.out.println("Hi, I am able to move backward");

    }
    public void turnLeft() {
        System.out.println("I'm turning Left");
    }
    public void turnRight() {
        System.out.println("I'm turning right");
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", generation='" + generation + '\'' +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }
}
