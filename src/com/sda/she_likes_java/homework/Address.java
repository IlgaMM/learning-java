package com.sda.she_likes_java.homework;

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

    String country;
    String city;
    String street;
    int streetNumber;
    String postalCode;

    public static void main(String[] args) {

        Address anna = new Address();
        anna.country = "Lithuania";
        anna.city = "Vilnius";
        anna.street = "Ukmergės street";
        anna.streetNumber = 244;
        anna.postalCode = "LT-07160";

        Address ilga = new Address();
        ilga.country = "Latvia";
        ilga.city = "Riga";
        ilga.street = "Salnas";
        ilga.streetNumber = 21;
        ilga.postalCode = "LV-1021";

        System.out.println("Anna's address: "+anna.country+", "+anna.city+", "+anna.street+" "+anna.streetNumber+", "+anna.postalCode);
        System.out.println("Ilga's address: "+ilga.country+", "+ilga.city+", "+ilga.street+" "+ilga.streetNumber+", "+ilga.postalCode);

    }
}