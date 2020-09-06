package com.example.designpattern.interpreter;

/**
 * @author zhangquanwei
 */
public abstract class Expression {

    Context context;

    /**
     * 解释一个给定的表达式
     * @param context
     */
    public abstract void interpret(Context context);

}
