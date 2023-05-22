package com.sda.she_likes_java.sorting;

import com.sda.she_likes_java.objects_equality.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPersonsMain {
    public static void main(String[] args) {
        SortedPerson olaf = new SortedPerson("Olaf",22);
        SortedPerson gustaw = new SortedPerson("Gustaw",11);

        List<SortedPerson> persons = new ArrayList<>();
        persons.add(olaf);
        persons.add(gustaw);

        Collections.sort(persons);
        //if returns -1 that means:olaf, gustav
        //if returns 1 that means:olaf, gustav
        olaf.compareTo(gustaw);

    }
}
