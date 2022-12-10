package com.startjava.lesson_2_3_4.bookcase;

import java.util.Scanner;

public class BookCaseTest {
    public static void main(String[] args) {
        Menu menu = new Menu(new Scanner(System.in, "Cp866"), new BookCase());
        menu.start();
    }
}
