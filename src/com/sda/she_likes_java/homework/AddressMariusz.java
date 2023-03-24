package com.sda.she_likes_java.homework;

public class AddressMariusz {
        String country;
        String city;
        String street;
        // 02-987
        // 011
        String postalCode;

        @Override
        public String toString() {
            return "AddressMariusz{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", postalCode='" + postalCode + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            AddressMariusz myFirstAddress = new AddressMariusz();
            myFirstAddress.country = "Poland";
            myFirstAddress.city = "Warsaw";

            AddressMariusz mySecondAddress = new AddressMariusz();
            mySecondAddress.country = "Poland";
            mySecondAddress.city = "Rzeszow";

            System.out.println("City from first address: " + myFirstAddress.city);
            System.out.println("City from second address: " + mySecondAddress.city);

            System.out.println("Using toString for myFirstAddress: " + myFirstAddress);
            System.out.println(mySecondAddress);
        }
    }

