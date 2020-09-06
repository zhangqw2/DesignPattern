package com.example.designpattern.interpreter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {

    /**
     * 输入
     */
    private String input;
    /**
     * 结果
     */
    private int output;


    public Context(String input){
        this.input = input;
    }

    @Override
    public String toString() {
        return input + "=" + output;
    }
}
