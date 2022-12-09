package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    static final int MAX_ATTEMPTS = 10;
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private Scanner scanner;

    public GuessNumber(Scanner scanner, Player player1, Player player2) {
        System.out.println("У каждого игрока по 10 попыток");

        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void startGame() {
        generateNumber();

        player1.clear();
        player2.clear();

        int step = 0;
        do {
            System.out.println("--- Попытка №" + ++step);
        } while(step <= MAX_ATTEMPTS && !isGuessed());

        printPlayerNumbers(player1, player2);
    }

    private void generateNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed() {
        if(makeMove(player1) || makeMove(player2)) return true;
        return false;
    }

    private boolean makeMove(Player player) {
        System.out.print(player.getName() + ", введите число: ");

        int number = inputNumber();
        player.addNumber(number);

        if(number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + hiddenNumber +
                    " с " + player.getAttempt() + " попытки");
            return true;
        }

        System.out.println("Число " + number + (number > hiddenNumber ? " больше" : " меньше") +
            " того, что загадал компьютер.");

        if(player.getAttempt() >= MAX_ATTEMPTS)
            System.out.println("У " + player.getName() + " закончились попытки");

        return false;
    }

    private int inputNumber() {
        while (!scanner.hasNextInt()) {
            System.out.print("Введено не число. Попробуйте снова: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void printPlayerNumbers(Player... players) {
        for(Player player: players) {
            int[] numbers = player.getNumbers();
            System.out.print(player.getName() + ": ");
            for(int number : numbers)
                System.out.print(number + " ");
            System.out.println();
        }
    }
}