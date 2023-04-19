package com.sda.she_likes_java.homework.Exercise17;

public class Book {
    private static int numberOfBooksCreated;
    private String author;
    private String title;
    private int yearOfPublication;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        numberOfBooksCreated++;
    }

    public static int getNumberOfBooksCreated() {
        return numberOfBooksCreated;
    }

    public static void setNumberOfBooksCreated(int numberOfBooksCreated) {
        Book.numberOfBooksCreated = numberOfBooksCreated;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
