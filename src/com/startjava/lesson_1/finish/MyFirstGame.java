package com.startjava.lesson_1.finish;

//Игра “Угадай число”
public class MyFirstGame {    

    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"");

        int minRange = 1;
        int maxRange = 100;

        int hiddenNum = 32;
        int playerNum = 99;

        int cntStep = 1;
        while(maxRange != minRange) {
            if(playerNum > hiddenNum) {
                System.out.println(cntStep + ") Число " + playerNum + " больше того, что загадал компьютер");
                maxRange = playerNum - 1;
            } else if(playerNum < hiddenNum) {
                System.out.println(cntStep + ") " + playerNum + " меньше того, что загадал компьютер");
                minRange = playerNum + 1;
            } else {
                break;
            }
            playerNum = minRange + (maxRange - minRange) / 2;
            cntStep++;
        }
        System.out.println(cntStep + ") Вы победили!");
    }   
}