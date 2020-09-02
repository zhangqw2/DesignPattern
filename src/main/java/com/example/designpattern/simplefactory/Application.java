package com.example.designpattern.simplefactory;

/**
 * @author zhangquanwei
 */
public class Application {
    public static void main(String[] args){
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.produce("apple");
        fruit.eat();
    }
}
