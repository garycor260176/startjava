package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNum;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void startGame() {
        generateNumber( );

        int step = 0;
        do {
            System.out.println("--- Попытка №" + ++step);
        } while(!isGuessed(player1) && !isGuessed(player2));
    }

    private void generateNumber() {
        hiddenNum = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed(Player player) {
        System.out.print(player.getName( ) + ", введите число: ");
        int num = inputNum();
        if(checkNum(num)) {
            System.out.println(player.getName( ) + ", поздравляем. Вы выиграли!");
            return true;
        }
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
}