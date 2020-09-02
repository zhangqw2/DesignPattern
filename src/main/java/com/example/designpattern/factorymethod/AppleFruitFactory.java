package com.example.designpattern.factorymethod;

/**
 * @author zhangquanwei
 */
public class AppleFruitFactory extends FruitFactory{
    @Override
    public Fruit produceFruit() {
        return new Apple();
    }
}
