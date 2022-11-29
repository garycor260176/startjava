package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "";
        do {
            System.out.print("Введите математическое выражение в формате [число] [операция] [число]: ");

            if(calculator.setExpr(scanner.nextLine( )))
                System.out.println("Результат: " + calculator.calculate());

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while(!"yes".equals(answer) && !"no".equals(answer));

        } while(!"no".equals(answer));
    }
}