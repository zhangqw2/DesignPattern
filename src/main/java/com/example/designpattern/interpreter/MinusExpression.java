package com.example.designpattern.interpreter;

/**
 * 累减
 * @author zhangquanwei
 */
public class MinusExpression extends Expression {

    /**
     * 解释一个给定的表达式
     *
     * @param context
     */
    @Override
    public void interpret(Context context) {

        this.context = context;
        String input = context.getInput();
        int in = Integer.valueOf(input);
        context.setOutput(in-1);

    }

    @Override
    public String toString() {
        return "--"+context.getInput()+"="+context.getOutput();
    }
}
