package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers;
    private int Attempt;
    private int maxNumbersAttempt;
    private int numbersWin;
    
    public Player(String name) {
        this.name = name;
        numbers = new int[10];
        maxNumbersAttempt = numbers.length;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return Attempt;
    }

    public void clear() {
        if(Attempt > 0)
            Arrays.fill(numbers, 0, Attempt, 0);
        Attempt = 0;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, Attempt);
    }

    public boolean addNumber(int number) {
        if(Attempt >= maxNumbersAttempt) return false;

        if(number < 1 || number > 100) {
            System.out.print("Число " + number + " не входит в интервал (0, 100]. Попробуйте еще раз: ");
            return false;
        }

        numbers[Attempt++] = number;
        return true;
    }

     public int getNumbersWin() {
        return numbersWin;
    }

    public void setNumbersWin(int numbersWin) {
        this.numbersWin = numbersWin;
    }
}