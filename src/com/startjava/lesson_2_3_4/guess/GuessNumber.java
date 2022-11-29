package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNum;
    private Scanner scanner;
    private int maxNumbersAttempt;

    public GuessNumber(int maxNumbersAttempt, Player player1, Player player2, Scanner scanner) {
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
            System.out.println("--- Попытка №" + ++step);
        } while(step <= maxNumbersAttempt && !isGuessed(player1) && !isGuessed(player2));

        printPlayerAttempts(player1);
        printPlayerAttempts(player2);
    }

    private void generateNumber() {
        hiddenNum = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed(Player player) {
        if(player.getCurrentAttempt() >= maxNumbersAttempt)
            return false;
        System.out.print(player.getName( ) + ", введите число: ");
        int num = inputNum();
        player.addNumber(num);
        if(checkNum(num)) {
            System.out.println("Игрок " + player.getName( ) + " угадал число " + hiddenNum +
                " с " + player.getCurrentAttempt() + " попытки");
            return true;
        }
        if(player.getCurrentAttempt() >= maxNumbersAttempt)
            System.out.println("У " + player.getName() + " закончились попытки");
        return false;
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

    private boolean checkNum(int num) {
        if(num == hiddenNum) return true;

        if(num > hiddenNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер.");
        } else if(num < hiddenNum) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер.");
        }
        return false;
    }

    private void printPlayerAttempts(Player player) {
        int[] attempts = player.getAttempts();
        System.out.print(player.getName() + ": ");
        for(int num : attempts)
            System.out.print(num + " ");
        System.out.println();
    }
}