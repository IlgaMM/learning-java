package com.sda.she_likes_java.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Cat myCat = new Cat();
        Animal secondCat = new Cat();
        Animal dog = new Dog();
        dog.makeSound();
        myCat.makeSound();

        callAnimal(someAnimal);
        callAnimal(myCat);
        callAnimal(dog);
        callAnimal(new Elephant());

        Object anotherCat = new Cat();
        Animal animalCat = new Cat();
        Cat thirdCat = new Cat();


        }
        public static void callAnimal(Animal animal){
        animal.makeSound();
        }
    }

