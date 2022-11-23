package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {    

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String answer = "";
        while(!"no".equals(answer)) {
            System.out.print("Введите первое число: ");
            calculator.setNum1(inputNum(scanner));

            System.out.print("Введите знак математической операции: ");
            while(true) {
                char sign = scanner.next().charAt(0);
                if(calculator.setSign(sign)) break;
                System.out.print("Операция '" + sign +  "' недоступна. Попробуйте снова: ");
            }

            System.out.print("Введите второе число: ");
            calculator.setNum2(inputNum(scanner));

            System.out.println("Результат: " + calculator.calc());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            } while(!"yes".equals(answer) && !"no".equals(answer));
        }
    }

    private static int inputNum(Scanner scanner) {
        int num;
        while(!scanner.hasNextInt()) {
            System.out.print("Введено не число. Попробуйте снова: ");
            scanner.next();
        }
        num = scanner.nextInt();
        return num;
    }
}