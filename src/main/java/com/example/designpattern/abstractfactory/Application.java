package com.example.designpattern.abstractfactory;



/**
 * @author zhangquanwei
 */
public class Application {
    public static void main(String[] args) {
        FruitFactory factory = new AppleFruitFactory();
        factory.getFruit().buy();
        factory.getPrice().pay();
    }
}
