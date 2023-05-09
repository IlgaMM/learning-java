package com.sda.she_likes_java.homework.exercise20;

public class CarUtils {
    public static void safeCast (Car car) {
        if (car instanceof Mazda mazda) {
            mazda.mazdaStops();
            mazda.mazdaChangesColor();
            mazda.mazdaTurboSpeed();
        } else if (car instanceof Toyota toyota) {
            toyota.toyota4wheelDrive();
            toyota.toyotaOffRoad();
            toyota.toyotaSnailSpeed();
        } else {
            System.out.println("Object sent is of different type.");
        }

    }
    public static void useToyota(Toyota car){

    }
}
