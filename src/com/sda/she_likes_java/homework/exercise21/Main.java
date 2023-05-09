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
                 ((Floating) vehicle).swim();
             }

             if (vehicle instanceof Diving) {
                 ((Diving) vehicle).diving();
             }

             System.out.println();

         }
     }
 }


  /*  public static void main(String[] args) {
        Ship justShip = new Ship();
        justShip.move();
        Vehicle ship = new Ship();
        ship.move();
//        ship.swin();
        ((Floating) ship).swim();

        Vehicle airplane = new Airplane();
        airplane.move();
        ((Flying) airplane).fly();

        Vehicle submarine = new Submarine();
        submarine.move();
        ((Diving) submarine).diving();
    }
*/