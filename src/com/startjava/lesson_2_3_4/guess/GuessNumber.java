package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final int NUMBER_ROUNRS = 3;
    static final int MAX_ATTEMPTS = 10;
    private Player[] players;
    private int hiddenNumber;
    private Scanner scanner;

    private int maxWins;

    public GuessNumber(Scanner scanner, Player... players) {
        System.out.println("У каждого игрока по 10 попыток");
        this.players = players;
        this.scanner = scanner;
    }

    public void startGame() {
        System.out.println("========== Начало игры ==============");

        maxWins = 0;

        castLots();

        int round = 1;
        while(round <= NUMBER_ROUNRS) {
            System.out.println("======== Раунд " + round++ + " ======== ");
            startRound();
        }

        printWinners();
    }

    private void castLots() {
        int i = players.length - 1;
        while(i > 1) {
            int rand = (int) (Math.random() * i);
            Player tmp = players[rand];
            players[rand] = players[i];
            players[i--] = tmp;
        }
    }

    public void startRound() {
        generateNumber();

        for(Player player : players)
            player.clear();

        int step = 1;
        while(step <= MAX_ATTEMPTS) {
            System.out.println("--- Попытка №" + step++);
            if(isGuessed()) break;
        }

        printPlayerNumbers();
    }

    private void generateNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed() {
        for(Player player : players) {
            if(makeMove(player)) {
                return true;
            }
        }
        return false;
    }

    private boolean makeMove(Player player) {
        System.out.print(player.getName() + ", введите число: ");

        int number = inputNumber(player);

        if(number == hiddenNumber) {
            player.incWin();
            if(maxWins < player.getWins()) maxWins = player.getWins();
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

    private int inputNumber(Player player) {
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Введено не число. Попробуйте снова: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while(!player.addNumber(number));
        return number;
    }

    private void printPlayerNumbers() {
        for(Player player : players) {
            int[] numbers = player.getNumbers();
            System.out.print(player.getName() + ": ");
            for(int number : numbers)
                System.out.print(number + " ");
            System.out.println();
        }
    }

    private void printWinners() {
        System.out.println("========== Результат игры ===========");
        System.out.println("Количество угадываний:");
        int numberWins = 0;
        String winNames = "";
        for(int i = 0; i < players.length; i++) {
            System.out.println("Игрок '" + players[i].getName() + "': " + players[i].getWins());
            if(players[i].getWins() > 0 && players[i].getWins() == maxWins) {
                winNames = winNames + (winNames.length() > 0 ? "," : "" ) + players[i].getName();
                numberWins++;
            }
        }
        System.out.print("По результатам " + NUMBER_ROUNRS + " раундов " + (numberWins == 0 ? "нет победителя" :
                numberWins == 1 ? "Победитель: " + winNames : "Ничья: " + winNames));
        System.out.println("\n=====================================");
    }
}