package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberV02 {
    private Player players[];
    private int maxNumbersAttempt;
    private Scanner scanner;
    private int numbersRound;
    private int hiddenNum;

    public GuessNumberV02(int numbersRound, int maxNumbersAttempt, Scanner scanner, Player... players) {
         this.scanner = scanner;
         this.maxNumbersAttempt = maxNumbersAttempt;
         this.players = players;
         this.numbersRound = numbersRound;
    }

    public void startGame() {
        int round = 0;

        System.out.println("========== Начало игры ==============");
        for(Player player : players)
            player.setNumbersWin(0);

        while(round < numbersRound) {
            System.out.println("======== Раунд " + ++round + " ======== ");
            startRound( );
        }

        System.out.println("========== Результат игры ===========");
        System.out.println("Количество угадываний:");
        sortPlayersByWin(players, 0, players.length - 1);
        int maxWins = players[0].getNumbersWin();
        int idxWinners[] = new int[players.length];
        int numberWinners = 0;
        for(int i = 0; i < players.length; i++ ) {
            System.out.println("Игрок '" + players[i].getName() + "': " + players[i].getNumbersWin());
            if(players[i].getNumbersWin() == maxWins)
                idxWinners[numberWinners++] = i;
        }
        switch(numberWinners) {
            case 0:
                System.out.print("Нет победителя");
                break;
            case 1:
                System.out.print("Победитель: ");
                break;
            default:
                System.out.print("Ничья: ");
                break;
        }
        for(int i = 0; i < numberWinners; i++) {
            System.out.print(players[i].getName());
        }
        System.out.println("\n=====================================");
    }

    private void startRound() {
        generateNumber( );

        for(Player player : players)
            player.clear();

        castLots();

        int step = 0;
        do {
            if(step < maxNumbersAttempt)
                System.out.println("--- Попытка №" + ++step);
        } while(step <= maxNumbersAttempt && !isGuessed());

        for(Player player : players)
            printPlayerAttempts(player);
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
        hiddenNum = 1 + (int) (Math.random() * 100);
    }

    private boolean isGuessed() {
        int noAttempt = 0;
        for(Player player : players) {
            int result = isPlayerGuessed(player);
            switch(result) {
                case 1:
                    return true;
                case 0:
                    noAttempt++;
            }
        }
        if(noAttempt == players.length) return true;
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
            player.setNumbersWin(player.getNumbersWin() + 1);
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

    private void sortPlayersByWin(Player[] players, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(players, begin, end);
        sortPlayersByWin(players, begin, pivot-1);
        sortPlayersByWin(players, pivot+1, end);
    }

    private int partition(Player[] players, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (players[i].getNumbersWin() > players[pivot].getNumbersWin()) {
                Player temp = players[counter];
                players[counter] = players[i];
                players[i] = temp;
                counter++;
            }
        }
        Player temp = players[pivot];
        players[pivot] = players[counter];
        players[counter] = temp;

        return counter;
    }
}
