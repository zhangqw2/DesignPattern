package com.example.designpattern.abstractfactory;



/**
 * @author zhangquanwei
 */
public class AppleFruitFactory implements FruitFactory {

    @Override
    public Fruit getFruit() {
        return new AppleFruit();
    }

    @Override
    public Price getPrice() {
        return new ApplePrice();
    }
}
