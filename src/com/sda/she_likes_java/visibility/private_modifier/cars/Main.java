package com.sda.she_likes_java.visibility.private_modifier.cars;

public class Main {
    public static void main(String[] args) {
        Car funnyCar = new Car();
        //brand is private so not visible outside class
       // funnyCar.brand
        funnyCar.model = "corolla";
        funnyCar.colour = "pink"
    }
}
