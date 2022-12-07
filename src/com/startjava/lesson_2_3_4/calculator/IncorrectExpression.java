package com.startjava.lesson_2_3_4.calculator;

public class IncorrectExpression extends RuntimeException {

    public IncorrectExpression(String msg, RuntimeException err) {
        super(msg, err);
    }

    public IncorrectExpression(String msg) {
        super(msg);
    }
}
