package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public boolean setExpr(String expr) {
        String[] tokens = expr.split(" ");

        if(tokens.length != 3) {
            System.out.println("Введено не верное выражение.");
            return false;
        }
        if(!setNum1(tokens[0]) || !setSign(tokens[1].charAt(0)) || !setNum2(tokens[2])) return false;

        return true;
    }

    public boolean setNum1(String num1) {
        try {
            setNum1(Integer.parseInt(num1));
            return true;
        } catch (NumberFormatException n) {
            System.out.println("Не верное задано первое число.");
        }
        return false;
    }

    public boolean setNum2(String num2) {
        try {
            setNum2(Integer.parseInt(num2));
            return true;
        } catch (NumberFormatException n) {
            System.out.println("Не верное задано второе число.");
        }
        return false;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean setSign(char sign) {
        switch(sign) {
            case '+': 
            case '-': 
            case '*':
            case '/':
            case '^':
            case '%':
                this.sign = sign;
                return true;
        }
        System.out.println("Не верно задан оператор.");
        return false;
    }

    public double calculate() {
        switch(sign) {
            case '+':
                return Math.addExact((long) num1, (long) num2);
            case '-':
                return Math.subtractExact((long) num1, (long) num2);
            case '*':
                return Math.multiplyExact((long) num1, (long) num2);
            case '/':
                return (double) num1 / (double) num2;
            case '^':
                return Math.pow(num1, num2);
            case '%':
                return num1 % num2;
        }
        return 0;
    }

    public static double calc(String expr) throws IncorrectExpression {
        String[] tokens = expr.split(" ");

        if(tokens.length != 3) {
            throw new IncorrectExpression("Не верное выражение" );
        }

        int num1;
        try {
            num1 = Integer.parseInt(tokens[0]);
        } catch (NumberFormatException err) {
            throw new IncorrectExpression("Значение '" + tokens[0] + "' не является числом.", err);
        }

        int num2;
        try {
            num2 = Integer.parseInt(tokens[2]);
        } catch (NumberFormatException err) {
            throw new IncorrectExpression("Значение '" + tokens[2] + "' не является числом.", err);
        }

        try {
            return switch(tokens[1]) {
                case "+" -> Math.addExact((long) num1, (long) num2);
                case "-" -> Math.subtractExact((long) num1, (long) num2);
                case "*" -> Math.multiplyExact((long) num1, (long) num2);
                case "/" -> (double) num1 / (double) num2;
                case "^" -> Math.pow(num1, num2);
                case "%" -> num1 % num2;
                default -> throw new IncorrectExpression("Операция '" + tokens[1] + "' не обрабатывается" );
            };
        } catch (ArithmeticException  err) {
            throw new IncorrectExpression("Произошла недопустимая арифметическая операция", err);
        }
    }
}