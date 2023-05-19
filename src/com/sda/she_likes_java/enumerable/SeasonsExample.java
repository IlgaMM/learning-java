package com.sda.she_likes_java.enumerable;

import java.util.List;

public class SeasonsExample {
    public static void main(String[] args) {
        Seasons myFavouriteOne = Seasons.AUTUMN;
        System.out.println("Average temp during Autumn is: " + myFavouriteOne.getAverageTemp());
        System.out.println("autumn: " + myFavouriteOne);
        Seasons mostPopularActivity = Seasons.AUTUMN;
        System.out.println("Most popular activity in autumn is: " + mostPopularActivity.getActivity());
        Seasons autumn = Seasons.SUMMER;

        System.out.println("autumn: " + myFavouriteOne);
        List<Seasons> seasonsList = List.of(
                Seasons.WINTER,
                Seasons.AUTUMN,
                Seasons.SUMMER,
                Seasons.SPRING);
    }
}
