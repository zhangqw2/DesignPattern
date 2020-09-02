package com.example.designpattern.factorymethod;

/**
 * @author zhangquanwei
 */
public class Application {
    public static void main(String[] args) {
        FruitFactory factory = new AppleFruitFactory();
        Fruit fruit = factory.produceFruit();
        fruit.eat();
    }
}
