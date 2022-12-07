package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public double calculate(String expr) {
        parseExpr(expr);

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

    private void parseExpr(String expr) {
        String[] partsExpr = expr.split(" ");

        if(partsExpr.length != 3) {
            throw new IncorrectExpression("Не верное выражение" );
        }

        num1 = setNum(partsExpr[0]);
        sign = partsExpr[1].charAt(0);
        num2 = setNum(partsExpr[2]);
    }

    private int setNum(String num) {
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