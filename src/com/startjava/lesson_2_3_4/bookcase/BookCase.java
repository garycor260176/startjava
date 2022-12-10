package com.startjava.lesson_2_3_4.bookcase;

import com.startjava.lesson_2_3_4.calculator.IncorrectExpression;
import java.util.Arrays;

public class BookCase {
    private static final int NUM_SHELFS = 10;
    private int numBooks;
    private Book[] books;
    private int maxLengthInfo;

    public BookCase() {
        books = new Book[NUM_SHELFS];
    }

    public int add(Book book) {
        if(numBooks == NUM_SHELFS) {
            throw new IncorrectExpression("Шкаф уже полностью заполнен.");
        }
        books[numBooks++] = book;
        if(maxLengthInfo < book.getLenghtInfo()) maxLengthInfo = book.getLenghtInfo();
        return numBooks;
    }

    public Book get(int idx) {
        return books[idx];
    }

    public int getNums() {
        return numBooks;
    }

    public int[] find(String title) {
        int numFounded = 0;
        int idxFounded[] = new int[books.length];
        for(int i = 0; i < numBooks; i++) {
            if(title.equals(books[i].getTitle()))
                idxFounded[numFounded++] = i;
        }
        if(numFounded == 0)
            throw new IncorrectExpression("Книга '" + title + "' не найдена.");
        return Arrays.copyOf(idxFounded, numFounded);
    }

    public int delete(String title) {
        int foundedBooks[] = find(title);
        if(foundedBooks.length == 0)
            throw new IncorrectExpression("Книга '" + title + "' не найдена.");
        for(int i = foundedBooks.length - 1; i >= 0; i--)
            delete(foundedBooks[i]);
        return foundedBooks.length;
    }

    public void delete(int idx) {
        if(idx < 0 || idx >= numBooks) throw new IncorrectExpression("Книга не найдена.");
        if(idx == numBooks - 1) books[idx] = null;
        System.arraycopy(books, idx + 1, books, idx, numBooks - idx);
        numBooks--;
        recalcCaseWidth();
    }

    public void clear() {
        if(numBooks == 0) return;
        Arrays.fill(books, 0, numBooks, null);
        numBooks = 0;
    }

    public int getMaxLengthInfo() {
        return maxLengthInfo;
    }

    private void recalcCaseWidth() {
        maxLengthInfo = 0;
        for(int i = 0; i < numBooks; i++ ) {
            if(maxLengthInfo < books[i].getLenghtInfo()) maxLengthInfo = books[i].getLenghtInfo();
        }
    }
}
