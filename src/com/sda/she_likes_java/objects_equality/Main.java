package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a = 5, b =10;
        int c = 5;
        System.out.println("are a and b equal?: " + (a==b));
        System.out.println("are a and b equal?: " + (a==c));

        String name1 = "Ilga";
        String name2 = "Ilga";
        System.out.println("name1 == name2: " + (name1 == name2));

        String name3 = new String("Ilga");
        String name4 = new String("Ilga");
        System.out.println("name1 == name2: " + (name3 == name4));


        Person first = new Person("Anna","Vanna",18);
        Person second = new Person("Anna","Vanna",18);
        Person third = second;

        System.out.println("first == second: "+ (first == second));
        System.out.println("first is equal to second: " + (first.equals(second)));
        System.out.println("third is equal to second: " + (third.equals(second)));
    }
}
