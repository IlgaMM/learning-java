package com.sda.she_likes_java.homework;

public class Exercise13 {
    /*
    tā iespējams rakstīt visādas piezīmes, garākas, vairākās rindiņās

     */
    public static void main(String[] args) {
        int[] element1 = new int[100];

        for (int index = 0; index < element1.length; index++) {
           element1[index] = 3 * index;
            System.out.println("number:" + element1[index]);
        }
    }
}
