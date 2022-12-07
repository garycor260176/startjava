package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expr) {
        String[] partsExpr = expr.split(" ");

        if(partsExpr.length != 3) {
            throw new IncorrectExpression("Не верное выражение" );
        }

        int num1 = setNum(partsExpr[0]);
        char sign = partsExpr[1].charAt(0);
        int num2 = setNum(partsExpr[2]);

        try {
            return switch(sign) {
                case '+' -> Math.addExact(num1, num2);
                case '-' -> Math.subtractExact(num1, num2);
                case '*' -> Math.multiplyExact(num1, num2);
                case '/' -> num1 / num2;
                case '^' -> Math.pow(num1, num2);
                case '%' -> num1 % num2;
                default -> throw new IncorrectExpression("Операция '" + sign + "' не обрабатывается" );
            };
        } catch (ArithmeticException  err) {
            throw new IncorrectExpression("Недопустимая арифметическая операция", err);
        }
    }

    private static int setNum(String num) {
        int value = 0;
        try {
            value = Integer.parseInt(num);
            if(value < 0)
                throw new IncorrectExpression("Значение '" + value + "' должно быть положительным.");
        } catch (NumberFormatException err) {
            throw new IncorrectExpression("Значение '" + num + "' не является числом.", err);
        }
        return value;
    }
}