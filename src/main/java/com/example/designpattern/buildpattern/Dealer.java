package com.example.designpattern.buildpattern;

/**
 *经销商类
 * @author zhangquanwei
 */
public class Dealer {
    private ShopBuilder builder;

    public void setBuilder(ShopBuilder builder) {
        this.builder = builder;
    }

    public Shop build(String name, String location, String type) {
        this.builder.name(name);
        this.builder.location(location);
        this.builder.type(type);
        return builder.build();
    }
}
