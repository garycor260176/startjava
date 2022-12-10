package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int attempt;

    public Player(String name) {
        this.name = name;
        numbers = new int[GuessNumber.MAX_ATTEMPTS];
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clear() {
        if(attempt > 0)
            Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public boolean addNumber(int number) {
        if(number < 1 || number > 100) {
            System.out.print("Число должно входить в диапазон (1, 100]. Попробуйте снова: ");
            return false;
        }
        numbers[attempt++] = number;
        return true;
    }
}