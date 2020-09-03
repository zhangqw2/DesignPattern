package com.example.designpattern.decoratorpattern;

/**
 * @author zhangquanwei
 */
public class KiwiDecorator extends AbstractDecorator {
    public KiwiDecorator(AbstractFruitSalad fruitSalad) {
        super(fruitSalad);
    }

    @Override
    public String remark() {
        return super.remark() + "加份猕猴桃切\n";
    }

    @Override
    public int price() {
        return super.price() + 2;
    }
}
