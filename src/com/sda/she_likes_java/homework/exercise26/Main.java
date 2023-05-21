package com.sda.she_likes_java.homework.exercise26;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ilga's important events.");
        ImportantEvents lifeIsGood = ImportantEvents.BIRTHDAY;
        System.out.println("First in " + lifeIsGood.getDate() + " " + lifeIsGood.getDescription());
        lifeIsGood = ImportantEvents.WEDDING;
        System.out.println("When I was 23 years old I fell in love and " + lifeIsGood.getDate() + " " + lifeIsGood.getDescription());
        lifeIsGood = ImportantEvents.MADARASBD;
        System.out.println("Life was great and we wanted a child so " + lifeIsGood.getDate() + " " + lifeIsGood.getDescription());
        lifeIsGood = ImportantEvents.MELISASBD;
        System.out.println("Madara wanted a little sister so " + lifeIsGood.getDate() + " " + lifeIsGood.getDescription());

        ImportantEvents[] allGoodLifeEvents = ImportantEvents.values();
        System.out.println("Life is still good because of these events");
        System.out.println("First event was: " + allGoodLifeEvents[1]);
        System.out.println("Second event was: " + allGoodLifeEvents[0]);
        System.out.println("Third event was: " + allGoodLifeEvents[2]);
        System.out.println("Fourth event was: " + allGoodLifeEvents[3]);

        for (ImportantEvents event : allGoodLifeEvents){
            System.out.println(event.getDescription());
            System.out.println(event.getDate());
        }
    }
}
