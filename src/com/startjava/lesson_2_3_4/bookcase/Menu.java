package com.startjava.lesson_2_3_4.bookcase;

import com.startjava.lesson_2_3_4.calculator.IncorrectExpression;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private BookCase bookcase;

    public Menu(Scanner scanner, BookCase bookcase) {
        this.scanner = scanner;
        this.bookcase = bookcase;
    }

    public void start() {
        printCaseAndMenu();
        selectMenu();
    }

    private void print() {
        System.out.println("""
            1. добавить книгу <author> <title> <publishYear>
            2. найти книгу <title>
            3. удалить книгу по названию
            4. удалить книгу по индексу
            5. очистить шкаф
            9. выход
            """);
        System.out.print("Выберите действие: ");
    }

    private void selectMenu() {
        while(true) {
            switch(inputNum("", "Неверно выбрано действие. Попробуйте снова: ")) {
                case 1:
                    inputBook();
                    break;
                case 2:
                    findBook();
                    break;
                case 3:
                    deleteBookByTitle();
                    break;
                case 4:
                    deleteBookByIdx();
                    break;
                case 5:
                    clearBookCase();
                    break;
                case 9:
                    return;
                default:
                    System.out.print("Неверно выбрано действие. Попробуйте снова: ");
                    break;
            }
        }
    }

    private int inputNum(String label, String errMsg) {
        if(label.length() > 0)
            System.out.print(label);
        while(true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException err) {
                System.out.print(errMsg);
            }
        }
    }

    private void inputBook() {
        try {
            bookcase.add(new Book(inputString("Автор: "), inputString("Название: "),
                inputNum("Год публикации: ", "Не верно задан год. Попробуйте снова: ")));
            System.out.print("Книга добавлена. ");
        } catch (IncorrectExpression err) {
            System.out.print(err.getMessage());
        }
        inputEnter();
    }

    private void deleteBookByIdx() {
        int idx = inputNum("Введите индекс книги (от 1 до " + bookcase.getNums() + "): ", "Введено не число. Попробуйте снова: ");
        try {
            bookcase.delete(idx - 1);
            System.out.print("Книга удалена. ");
        } catch (IncorrectExpression err) {
            System.out.print(err.getMessage());
        }
        inputEnter();
    }

    private void deleteBookByTitle() {
        try {
            System.out.print("Удалено " + bookcase.delete(inputString("Введите название книги: ")) +
                " книг. ");
        } catch (IncorrectExpression err) {
            System.out.print(err.getMessage());
        }
        inputEnter();
    }

    private String inputString(String label) {
        if(label.length() > 0)
            System.out.print(label);
        return scanner.nextLine();
    }

    private void clearBookCase() {
        bookcase.clear();
        System.out.print("Шкаф очищен. ");
        inputEnter();
    }

    private void findBook() {
        int[] indexes = bookcase.find(inputString("Введите название книги: "));
        System.out.println( indexes.length == 0 ? "Книги не найдены: " : "Найдено " + indexes.length + " книг:");
        for(int index : indexes) {
            System.out.println(bookcase.get(index).toString());
        }
        inputEnter();
    }

    private void inputEnter() {
        System.out.print("Для продолжения работы нажмите Enter...");
        scanner.nextLine();
        printCaseAndMenu();
    }

    private void printCaseAndMenu() {
        printCase();
        print();
    }

    private void printCase() {
        int numBooks = bookcase.getNums();
        int maxLengthInfo = bookcase.getMaxLengthInfo();
        if(numBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        for(int i = 0; i <= numBooks; i++) {
            if(i > 0)
                System.out.print("|" + "-".repeat(maxLengthInfo) + "|\n");
            System.out.printf("|%-" + maxLengthInfo + "s|\n", (i < numBooks) ? bookcase.get(i).toString() : "");
            if(i == numBooks) break;
        }
    }
}
