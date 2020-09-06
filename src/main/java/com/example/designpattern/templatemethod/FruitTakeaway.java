package com.example.designpattern.templatemethod;

/**
 * @author zhangquanwei
 */
public class FruitTakeaway extends Takeaway {
    @Override
    protected void make() {
        System.out.println("水果配货");
    }

    @Override
    protected boolean needTableware() {
        return false;
    }
}
