package com.startjava.lesson_2_3_4.bookcase;

public class Book {
    private String author;
    private String title;
    private int yearPublication;
    private int lenghtInfo;

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
        lenghtInfo = toString( ).length();
    }

    public int getLenghtInfo() {
        return lenghtInfo;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublication;
    }
}
