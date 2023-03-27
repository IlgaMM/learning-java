package com.sda.she_likes_java.classes.constructor;

public class FullPerson {
    String name;
    String surname;
    int age;
    FullAddress address;

    public FullPerson() {
    }

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "FullPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        FullAddress address = new FullAddress("Latvija","Rīga", "Salnas","LV1021");
        FullPerson person = new FullPerson("Ilga","Miezaine-Mustermane", 35, address);
        System.out.println("Person is: "+ person);
    }
}
