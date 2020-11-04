package com.example.designpattern.chainofresponsibility;

/**
 * @author zhangquanwei
 */
public class StringLengthValidator extends StringValidator {
    @Override
    public void check(String value) {
        if (value != null && value.length() != 0) {
            System.out.println("字符串长度合法");
            if (validator != null) {
                validator.check(value);
            }
        } else {
            System.out.println("字符串长度不合法");
        }
    }
}
