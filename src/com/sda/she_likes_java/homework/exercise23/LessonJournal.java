package com.sda.she_likes_java.homework.exercise23;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LessonJournal {
    private List<String> pupils;
    private List<String> subjects;
    private Map<String, Map<String, Double>> grades;

    public LessonJournal(List<String> pupils, List<String> subjects) {
        this.pupils = pupils;
        this.subjects = subjects;
        this.grades = new HashMap<>();

        for (String pupil : pupils) {
            Map<String, Double> subjectGrades = new HashMap<>();
            for (String subject : subjects) {
                subjectGrades.put(subject, 0.0);
            }
            grades.put(pupil, subjectGrades);
        }

    }

    public List<String> getPupils() {
        return pupils;
    }


    public List<String> getSubjects() {
        return subjects;
    }

    public Double getGrade(String pupil,String subject) {
        return grades.get(pupil).get(subject);
    }

    public void setGrade(String pupil,String subject,double grade) {
        grades.get(pupil).put(subject , grade);
    }

}

