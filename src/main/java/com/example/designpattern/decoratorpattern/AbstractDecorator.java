package com.example.designpattern.decoratorpattern;

/**
 * 抽象的装饰器AbstractDecorator
 * @author zhangquanwei
 */
public class AbstractDecorator extends AbstractFruitSalad {
    private AbstractFruitSalad fruitSalad;

    public AbstractDecorator(AbstractFruitSalad fruitSalad){
        this.fruitSalad = fruitSalad;
    }

    @Override
    public String remark() {
        return fruitSalad.remark();
    }

    @Override
    public int price() {
        return fruitSalad.price();
    }
}
