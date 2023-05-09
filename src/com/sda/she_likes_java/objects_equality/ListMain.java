package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List personList = new ArrayList<>();
        List <Object> personObject = new ArrayList<>();

        Person me = new Person("Ilga", "Smilga",30);
        Person me2 = new Person("Zane", "Rade",35);
        Person otherOne = new Person("Olaf","Elza",5);

        personList.add(me);
        personList.add(me2);
        personList.add(otherOne);
        personList.add(new Car("blue"));

        System.out.println(personList);
        System.out.println("Tray to get person out of list");
        System.out.println("Person from list: "+ personList.get(1));
        Person personFromList = (Person) personList.get(1);
        Object fromPosition0 = personList.get(0);

        System.out.println("age of the person fromPosition0: " + ((Person)fromPosition0).getAge());

        List<Person> betterPersonList = new ArrayList<>();
        betterPersonList.add(me);
        Person fromTheList = betterPersonList.get(0);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pink"));
        System.out.println("car colour is: "+ cars.get(0).colour);


    }
}
