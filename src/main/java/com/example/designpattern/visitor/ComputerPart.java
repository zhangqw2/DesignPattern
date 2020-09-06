package com.example.designpattern.visitor;

/**
 * @author zhangquanwei
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
