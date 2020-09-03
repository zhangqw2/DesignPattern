package com.example.designpattern.buildpattern;

/**
 * 抽象生成器
 * @author zhangquanwei
 *
 */
public abstract class ShopBuilder {
    private String name;
    private String location;
    private String type;

    public abstract void name(String name);
    public abstract void location(String location);
    public abstract void type(String type);

    public abstract Shop build();
}
