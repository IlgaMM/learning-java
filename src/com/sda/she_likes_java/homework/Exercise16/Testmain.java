package com.sda.she_likes_java.homework.Exercise16;

public class Testmain {

    public static void main(String[] args) {
        Animal pet = new Animal("Lara",4,"Latvijas dzinējsuns");
        Owner owner = new Owner("Ilga","Miezaine-Mustermane", "dog" + pet);
        System.out.println(owner);
    }
}

   // public void describeYourself() {
    //    System.out.println("Hi I'm " + name + " " + surname + " " + age);
