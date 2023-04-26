package com.sda.she_likes_java.homework.exercise20;

public class Ferrari extends Car{
    @Override
    public void drive() {
        super.drive();
        System.out.println("Ferrari is driving");
    }
    public void ferrariNeedPitStop(){
        System.out.println("Ferrari needs pit stop");
    }
    public void ferrariChangesSponsors(){
        System.out.println("Ferrari changed sponsors from Marlboro to Shell");
    }
    public void ferrariAutomaticGearbox(){
        System.out.println("Ferrari is available only with automatic gearbox");
    }
}
