package com.sda.she_likes_java.homework.exercise20;

public class Mazda extends Car {
    @Override
    public void drive() {
        super.drive();
        System.out.println("Mazda is driving");
    }
    public void mazdaStops() {
        System.out.println("Mazda is stopping");
    }
    public void mazdaTurboSpeed() {
        System.out.println("Mazda is driving very fast");
    }
    public void mazdaChangesColor() {
        System.out.println("White mazda becomes black");
    }
}
