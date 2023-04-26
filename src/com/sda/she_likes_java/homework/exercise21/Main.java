package com.sda.she_likes_java.homework.exercise21;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Airplane(), new Ship(), new Submarine()};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();

            if (vehicle instanceof Flying) {
                ((Flying) vehicle).fly();
            }

            if (vehicle instanceof Floating) {
                ((Floating) vehicle).floating();
            }

            if (vehicle instanceof Diving) {
                ((Diving) vehicle).diving();
            }

            System.out.println();

        }
    }
}