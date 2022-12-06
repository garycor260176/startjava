package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public double calculate(String expr) {
        parseExpr(expr);

        switch(sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль.");
                    return 0;
                } else {
                    return num1 / num2;
                }
            case '^':
                return Math.pow(num1, num2);
            case '%':
                return (Math.IEEEremainder(num1, num2));
            default:
                System.out.println("Ошибка вычислений");
                return 0;
        }
    }

    private void parseExpr(String expr) {
        String[] partsExpr = expr.split(" ");
        num1 = Integer.parseInt(partsExpr[0]);
        sign = partsExpr[1].charAt(0);
        num2 = Integer.parseInt(partsExpr[2]);
    }
}