package com.sda.she_likes_java.homework.Exercise17;

import java.util.Random;

public class MyBooks {

    public static void main(String[] args) {
        Book firstBook = new Book("Ilga","Dare to be different",2040);
        Book secondBook = new Book("Oskars","My first Album",2030);
        Book thirdBook = new Book("Madara", "Why Flowers?",2050);
        System.out.println("number of books: " + Book.getNumberOfBooksCreated());
        System.out.println("So we will create random number of books");
        int myBooks = Book.getNumberOfBooksCreated();

        Random numberGenerator = new Random();
        int generatedNumberOfBooks = numberGenerator.nextInt(18);
        Book.setNumberOfBooksCreated(generatedNumberOfBooks);
        System.out.println("random number of books: " + generatedNumberOfBooks);
        int randomBooks = Book.getNumberOfBooksCreated();
        int together = (randomBooks+myBooks);
        System.out.println("How much books are together: " +together);

    }
}
