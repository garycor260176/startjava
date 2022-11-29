package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("********* Игра 'Угадай число' ********* ");

        int maxNumbersAttempt = 10;
        System.out.println("У каждого игрока по " + maxNumbersAttempt + " попыток");

        Scanner scanner = new Scanner(System.in, "Cp866");

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine(), maxNumbersAttempt);

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine(), maxNumbersAttempt);

        GuessNumber guessNumber = new GuessNumber(maxNumbersAttempt, player1, player2, scanner);

        String answer = "";
        while(!"no".equals(answer)) {
            guessNumber.startGame();

            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
            } while(!"yes".equals(answer) && !"no".equals(answer));                
        }
    }    
}