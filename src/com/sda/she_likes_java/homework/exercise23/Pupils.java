package com.sda.she_likes_java.homework.exercise23;

import java.util.Objects;

public class Pupils {
    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Pupils{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pupils pupils = (Pupils) o;
        return Objects.equals(name, pupils.name) && Objects.equals(surname, pupils.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Pupils(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
