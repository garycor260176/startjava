package com.startjava.lesson_2_3_4.bookcase;

import com.startjava.lesson_2_3_4.calculator.IncorrectExpression;
import java.util.Arrays;

public class BookCase {
    static final int MAX_PLACES = 10;
    int numBooks;
    Book[] books;
    int maxLengthInfo;

    public BookCase() {
        books = new Book[MAX_PLACES];
    }

    public int addBook(String author, String title, int yearPublication) {
        Book book = new Book(author, title, yearPublication);
        return addBook(book);
    }

    public Book[] getBooks() {
        return books;
    }

    public int getNumbersBook() {
        return numBooks;
    }

    public int getEmptyPlace() {
        return MAX_PLACES - numBooks;
    }

    public int[] findBook(String title) {
        int numFounded = 0;
        int idxFounded[] = new int[books.length];
        for(int i = 0; i < numBooks; i++) {
            if(title == books[i].getTitle())
                idxFounded[numFounded++] = i;
        }
        if(numFounded == 0)
            throw new IncorrectExpression("Книга '" + title + "' не найдена.");
        return Arrays.copyOf(idxFounded, numFounded);
    }

    public void deleteBook(String title) {
        int foundedBooks[] = findBook(title);
        if(foundedBooks.length == 0)
            throw new IncorrectExpression("Книга '" + title + "' не найдена.");
        for(int i = foundedBooks.length - 1; i >= 0; i--)
            deleteBook(foundedBooks[i]);
    }

    public void deleteBook(int idx) {
        if(idx >= numBooks) throw new IncorrectExpression("Книга не найдена.");
        if(idx == numBooks - 1) books[idx] = null;
        System.arraycopy(books, idx + 1, books, idx, numBooks - idx);
    }

    public void clearCase() {
        if(numBooks == 0) return;
        numBooks = 0;
        Arrays.fill(books, 0, numBooks - 1, null);
    }

    private int addBook(Book book) {
        if(numBooks - 1 == MAX_PLACES) {
            throw new IncorrectExpression("Шкаф уже полностью заполнен.");
        }
        books[numBooks++] = book;
        if(maxLengthInfo < book.lenghtInfo) maxLengthInfo = book.lenghtInfo;
        return numBooks;
    }
}
