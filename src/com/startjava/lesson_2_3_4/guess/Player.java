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

    public void addNumber(int number) {
        numbers[attempt++] = number;
    }
}