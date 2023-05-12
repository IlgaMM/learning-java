package com.sda.she_likes_java.homework.exercise23;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> pupils = new ArrayList<>();
        pupils.add("Ilga");
        pupils.add("Zane");
        pupils.add("Anna");
        pupils.add("Pjotrs");

        List<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Geography");
        subjects.add("History");

        LessonJournal journal = new LessonJournal(pupils, subjects);

        journal.setGrade("Ilga","Geography",10);
        journal.setGrade("Anna","Math",7);
        journal.setGrade("Pjotrs","History",5);

        for (String pupil : pupils
             ) {
            for (String subject : subjects
                 ) {
                System.out.println( pupil + "-" +subject+ ": "+ journal.getGrade(pupil,subject));
            }
        }
    }
}
