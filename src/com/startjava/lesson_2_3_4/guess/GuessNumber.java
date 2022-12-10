package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    static final int MAX_ATTEMPTS = 10;
    private Player[] players;
    private int hiddenNumber;
    private Scanner scanner;

    private int[] wins;
    private int maxWins;

    public GuessNumber(Scanner scanner, Player... players) {
        System.out.println("У каждого игрока по 10 попыток");
        this.players = players;
        this.scanner = scanner;
        wins = new int[players.length];
    }

    public void startGame() {
        System.out.println("========== Начало игры ==============");

        Arrays.fill(wins, 0, wins.length, 0);
        maxWins = 0;

        castLots();

        int round = 0;
        while(round < 3) {
            System.out.println("======== Раунд " + ++round + " ======== ");
            startRound( );
        }

        System.out.println("========== Результат игры ===========");
        System.out.println("Количество угадываний:");
        int numberWins = 0;
        String winNames = "";
        for(int i = 0; i < players.length; i++) {
            System.out.println("Игрок '" + players[i].getName() + "': " + wins[i]);
            if(wins[i] > 0 && wins[i] == maxWins) {
                winNames = winNames + (winNames.length() > 0 ? "," : "" ) + players[i].getName();
                numberWins++;
            }
        }
        System.out.print("По результатам трех раундов " + (numberWins == 0 ? "нет победителя" :
                numberWins == 1 ? "Победитель: " + winNames : "Ничья: " + winNames));
        System.out.println("\n=====================================");
    }

    public void startRound() {
        generateNumber();

        for(Player player : players)
            player.clear();

        int step = 0;
        do {
            System.out.println("--- Попытка №" + ++step);
        } while(step <= MAX_ATTEMPTS && !isGuessed());

        printPlayerNumbers();
    }

    private void castLots() {
        int i = players.length - 1;
        while(i > 1 ) {
            int rand = (int) (Math.random() * i);
            Player tmp = players[rand];
            players[rand] = players[i];
            players[i--] = tmp;
        }
    }

    private void generateNumber() {
        hiddenNumber = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed() {
        for(int i = 0; i < players.length; i++) {
            if(makeMove(players[i])) {
                wins[i]++;
                if(maxWins < wins[i]) maxWins = wins[i];
                return true;
            }
        }
        return false;
    }

    private boolean makeMove(Player player) {
        System.out.print(player.getName() + ", введите число: ");

        int number;
        do {
            number = inputNumber();
        } while(!player.addNumber(number));

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

    private void printPlayerNumbers() {
        for(Player player : players) {
            int[] numbers = player.getNumbers();
            System.out.print(player.getName() + ": ");
            for(int number : numbers)
                System.out.print(number + " ");
            System.out.println();
        }
    }
}