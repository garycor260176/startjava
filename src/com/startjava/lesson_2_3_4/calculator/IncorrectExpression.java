package com.startjava.lesson_2_3_4.calculator;

public class IncorrectExpression extends RuntimeException {
    public IncorrectExpression(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
    public IncorrectExpression(String errorMessage) {
        super(errorMessage);
    }
}
