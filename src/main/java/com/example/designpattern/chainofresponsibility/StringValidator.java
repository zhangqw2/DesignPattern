package com.example.designpattern.chainofresponsibility;

/**
 * @author zhangquanwei
 */
public abstract class StringValidator {
    protected StringValidator validator;

    public void setNextValidator(StringValidator validator) {
        this.validator = validator;
    }

    public abstract void check(String value);
}
