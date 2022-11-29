package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int numbers[];
    private int currentAttempt;
    
    public Player(String name, int numbersAttempt) {
        this.numbers = new int[numbersAttempt];
        this.name = name;
        clear();
    }

    public void clear() {
        this.currentAttempt = 0;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempt(){
        return Arrays.copyOf(numbers, currentAttempt);
    }
}