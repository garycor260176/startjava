package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("********* Игра 'Угадай число' ********* ");

        int maxNumbersAttempt = 10;
        System.out.println("У каждого игрока по " + maxNumbersAttempt + " попыток");

        Scanner scanner = new Scanner(System.in, "Cp866");

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(maxNumbersAttempt, scanner, player1, player2);

        while(true){
            guessNumber.startGame();
            if(!Continue(scanner)) break;
        }
    }

    private static boolean Continue(Scanner scanner) {
        String answer;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
        } while(!"yes".equals(answer) && !"no".equals(answer));
        if("yes".equals(answer)) return true;
        return false;
    }
}