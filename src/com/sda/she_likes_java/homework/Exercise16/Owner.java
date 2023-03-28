package com.sda.she_likes_java.homework.Exercise16;

public class Owner {
    private String firstName;
    private String surname;
    private String animal;

    public Owner() {
    }
    public Owner(String firstName, String surname, String animal) {
        this.firstName = firstName;
        this.surname = surname;
        this.animal = animal;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}

