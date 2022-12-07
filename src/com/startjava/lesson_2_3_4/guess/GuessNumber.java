package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private final int maxNumbersAttempt = 10;
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private Scanner scanner;

    public GuessNumber(Scanner scanner, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void startGame() {
        generateNumber( );

        player1.clear();
        player2.clear();

        int step = 0;
        do {
            if(step < maxNumbersAttempt)
                System.out.println("--- Попытка №" + ++step);
        } while(step <= maxNumbersAttempt && !isGuessed());

        printPlayerAttempts(player1, player2);
    }

    private void generateNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed() {
        int resultStepPlayer1 = isPlayerGuessed(player1);
        if(resultStepPlayer1 == 1) return true;
        int resultStepPlayer2 = isPlayerGuessed(player2);
        if(resultStepPlayer2 == 1) return true;

        if(resultStepPlayer1 == 0 && resultStepPlayer2 == 0) return true;

        return false;
    }

    private int isPlayerGuessed(Player player) {
        if(player.getAttempt() >= maxNumbersAttempt)
            return 0;
        System.out.print(player.getName( ) + ", введите число: ");

        int number;
        do {
            number = inputNumber();
        } while(!player.addNumber(number));

        if(number == hiddenNumber) {
            System.out.println("Игрок " + player.getName( ) + " угадал число " + hiddenNumber +
                    " с " + player.getAttempt() + " попытки");
            return 1;
        }

        System.out.println("Число " + number + (number > hiddenNumber ? " больше" : " меньше") +
            " того, что загадал компьютер.");

        if(player.getAttempt() >= maxNumbersAttempt)
            System.out.println("У " + player.getName() + " закончились попытки");
        return 2;
    }

    private int inputNumber() {
        int number;
        while(!scanner.hasNextInt()) {
            System.out.print("Введено не число. Попробуйте снова: ");
            scanner.next();
        }
        number = scanner.nextInt();
        return number;
    }

    private void printPlayerAttempts(Player... players) {
        for(Player player: players) {
            int[] numbers = player.getNumbers();
            System.out.print(player.getName() + ": ");
            for(int number : numbers)
                System.out.print(number + " ");
            System.out.println();
        }
    }
}