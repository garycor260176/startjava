package com.startjava.lesson_2_3_4.bookcase;

import com.startjava.lesson_2_3_4.calculator.IncorrectExpression;
import java.util.Arrays;

public class BookCase {
    static final int MAX_PLACES = 10;
    private int numBooks;
    private Book[] books;
    private int maxLengthInfo;

    public BookCase() {
        books = new Book[MAX_PLACES];
    }

    public void print() {
        if(numBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        for(int i = 0; i < books.length; i++) {
            if(i > 0)
                System.out.print("|" + "-".repeat(maxLengthInfo) + "|\n");
            System.out.printf("|%-" + maxLengthInfo + "s|\n", (i < numBooks) ? books[i].toString() : "");
            if(i == numBooks) break;
        }
    }

    public int addBook(String author, String title, int yearPublication) {
        Book book = new Book(author, title, yearPublication);
        return addBook(book);
    }

    public Book getBook(int idx) {
        return books[idx];
    }

    public int getNumsBook() {
        return numBooks;
    }

    public int[] findBook(String title) {
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

    public int deleteBook(String title) {
        int foundedBooks[] = findBook(title);
        if(foundedBooks.length == 0)
            throw new IncorrectExpression("Книга '" + title + "' не найдена.");
        for(int i = foundedBooks.length - 1; i >= 0; i--)
            deleteBook(foundedBooks[i]);
        return foundedBooks.length;
    }

    public void deleteBook(int idx) {
        if(idx < 0 || idx >= numBooks) throw new IncorrectExpression("Книга не найдена.");
        if(idx == numBooks - 1) books[idx] = null;
        System.arraycopy(books, idx + 1, books, idx, numBooks - idx);
        numBooks--;
        recalcCaseWidth();
    }

    public void clear() {
        if(numBooks == 0) return;
        Arrays.fill(books, 0, numBooks - 1, null);
        numBooks = 0;
    }

    private int addBook(Book book) {
        if(numBooks == MAX_PLACES) {
            throw new IncorrectExpression("Шкаф уже полностью заполнен.");
        }
        books[numBooks++] = book;
        if(maxLengthInfo < book.lenghtInfo) maxLengthInfo = book.lenghtInfo;
        return numBooks;
    }

    private void recalcCaseWidth() {
        maxLengthInfo = 0;
        for(int i = 0; i < numBooks; i++ ) {
            if(maxLengthInfo < books[i].lenghtInfo) maxLengthInfo = books[i].lenghtInfo;
        }
    }
}
