package com.example.designpattern.templatemethod;

/**
 * @author zhangquanwei
 */
public class BarbecueTakeaway extends Takeaway {
    private final boolean needTableware;

    public BarbecueTakeaway(boolean needTableware) {
        this.needTableware = needTableware;
    }

    @Override
    protected void make() {
        System.out.println("制作烤肉");
    }

    @Override
    protected boolean needTableware() {
        return this.needTableware;
    }
}
