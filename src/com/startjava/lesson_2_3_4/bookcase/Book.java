package com.startjava.lesson_2_3_4.bookcase;

public class Book {
    String author;
    String title;
    int yearPublication;
    int lenghtInfo;

    public Book(String author, String title, int yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
        lenghtInfo = this.toString( ).length();
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public int getLengthInfo() {
        return lenghtInfo;
    }

    public String toString() {
        return author + ", " + title + ", " + yearPublication;
    }
}
