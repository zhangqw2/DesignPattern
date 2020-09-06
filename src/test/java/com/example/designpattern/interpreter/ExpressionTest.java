package com.example.designpattern.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {

    @Test
    void expressionTest(){
        Context context = new Context("50");

        Expression plus = new PlusExpression();
        Expression minus = new MinusExpression();
        //执行垒加
        plus.interpret(context);
        System.out.println(plus.toString());
        //垒减
        minus.interpret(context);
        System.out.println(minus.toString());
    }
}