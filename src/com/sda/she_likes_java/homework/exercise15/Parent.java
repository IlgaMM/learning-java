package com.sda.she_likes_java.homework.exercise15;

public class Parent {
    String firstName;
    String surname;
    Address address;
    Person firstChild;
    Person secondChild;

    public Parent(String firstName, String surname, Address address, Person firstChild, Person secondChild) {
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.firstChild = firstChild;
        this.secondChild = secondChild;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", firstChild=" + firstChild +
                ", secondChild=" + secondChild +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("Latvija", "Rīga", "Salnas", 21, "LV-2021");
        Person child1 = new Person("Madara", "Miezaine-Mustermane", 9);
        Person child2 = new Person("Melisa", "Miezaine-Mustermane", 4);
        Parent mamma = new Parent("Ilga", "Miezaine-Mustermane", address, child1, child2);

        System.out.println(mamma.toString());
    }
}



