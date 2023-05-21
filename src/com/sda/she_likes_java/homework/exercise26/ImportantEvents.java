package com.sda.she_likes_java.homework.exercise26;

import java.time.LocalDate;

public enum ImportantEvents {
    WEDDING(LocalDate.of(2014, 1, 23), "Married my husband"),
    BIRTHDAY(LocalDate.of(1987, 9, 26), "I was born"),
    MADARASBD(LocalDate.of(2014, 2, 9), "Madara was born"),
    MELISASBD(LocalDate.of(2019, 1, 26), "Melisa was born");

    private LocalDate date;
    private String description;

    ImportantEvents(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}