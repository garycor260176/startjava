package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNum;
    private Scanner scanner;
    private int maxNumbersAttempt;

    public GuessNumber(int maxNumbersAttempt, Scanner scanner, Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
        this.maxNumbersAttempt = maxNumbersAttempt;
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

        printPlayerAttempts(player1);
        printPlayerAttempts(player2);
    }

    private void generateNumber() {
        hiddenNum = 1 + (int) (Math.random() * 100);
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
        if(player.getCurrentAttempt() >= maxNumbersAttempt)
            return 0;
        System.out.print(player.getName( ) + ", введите число: ");

        int num;
        do {
            num = inputNum();
        } while(!player.addNumber(num));

        if(num == hiddenNum) {
            System.out.println("Игрок " + player.getName( ) + " угадал число " + hiddenNum +
                    " с " + player.getCurrentAttempt() + " попытки");
            return 1;
        }

        System.out.println("Число " + num + (num > hiddenNum ? " больше" : " меньше") +
            " того, что загадал компьютер.");

        if(player.getCurrentAttempt() >= maxNumbersAttempt)
            System.out.println("У " + player.getName() + " закончились попытки");
        return 2;
    }

    private int inputNum() {
        int num;
        while(!scanner.hasNextInt()) {
            System.out.print("Введено не число. Попробуйте снова: ");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }

    private void printPlayerAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.print(player.getName() + ": ");
        for(int num : attempts)
            System.out.print(num + " ");
        System.out.println();
    }
}