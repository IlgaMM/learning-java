package com.sda.she_likes_java.homework.exercise15;

public class Address {

    //Exercise 14
    //Create class with name Address
    //Put next variables inside it:
    //- country,
    //- city,
    //- street
    //- postal code
    //Use proper data types.
    //Try to create to create two different addresses objects and init them with some values.

    public String country;
    public String city;
    public String street;
    public int streetNumber;
    public String postalCode;

    public Address() {
    }
    public Address (String country, String city, String street, int streetNumber, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }
}



