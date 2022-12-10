package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("********* Игра 'Угадай число' ********* ");

        Scanner scanner = new Scanner(System.in, "Cp866");

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        System.out.print("Введите имя третьего игрока: ");
        Player player3 = new Player(scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(scanner, player1, player2, player3);

        do {
            guessNumber.startGame();
        } while(isNext(scanner));
    }

    private static boolean isNext(Scanner scanner) {
        String answer;
        do {
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scanner.next();
        } while(!"yes".equals(answer) && !"no".equals(answer));
        return "yes".equals(answer);
    }
}