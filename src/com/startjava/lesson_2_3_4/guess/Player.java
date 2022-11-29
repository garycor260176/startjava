package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int numbers[];
    private int currentAttempt;
    private int maxNumbersAttempt;
    
    public Player(String name, int maxNumbersAttempt) {
        this.numbers = new int[maxNumbersAttempt];
        this.name = name;
        this.maxNumbersAttempt = maxNumbersAttempt;
        clear();
    }

    public String getName() {
        return name;
    }

    public int getCurrentAttempt( ) {
        return currentAttempt;
    }


    public void clear() {
        if(currentAttempt > 0)
            Arrays.fill(numbers, 0, currentAttempt - 1, 0);

        this.currentAttempt = 0;
    }

    public int[] getAttempts(){
        return Arrays.copyOf(numbers, currentAttempt);
    }

    public boolean addNumber(int num){
        if(currentAttempt >= maxNumbersAttempt) return false;
        numbers[currentAttempt] = num;
        currentAttempt++;
        return true;
    }
}