package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int numbers[];
    private int currentAttempt;
    private int maxNumbersAttempt;

    private int numbersWin;
    
    public Player(String name) {
        //this.numbers = new int[maxNumbersAttempt];
        this.name = name;
        //this.maxNumbersAttempt = maxNumbersAttempt;
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

        currentAttempt = 0;
    }

    public int[] getAttempts(){
        return Arrays.copyOf(numbers, currentAttempt);
    }

    public boolean addNumber(int num){
        if(currentAttempt >= maxNumbersAttempt) return false;

        if(num < 1 || num > 100) {
            System.out.print("Число " + num + " не входит в интервал (0, 100]. Попробуйте еще раз: ");
            return false;
        }

        numbers[currentAttempt] = num;
        currentAttempt++;
        return true;
    }

     public int getNumbersWin() {
        return numbersWin;
    }

    public void setNumbersWin(int numbersWin) {
        this.numbersWin = numbersWin;
    }

    public void setMaxNumbersAttempt(int maxNumbersAttempt) {
        this.maxNumbersAttempt = maxNumbersAttempt;
        numbers = new int[this.maxNumbersAttempt];
    }
}