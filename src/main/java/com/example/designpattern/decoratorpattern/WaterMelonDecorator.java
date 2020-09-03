package com.example.designpattern.decoratorpattern;

/**
 * @author zhangquanwei
 */
public class WaterMelonDecorator extends AbstractDecorator {
    public WaterMelonDecorator(AbstractFruitSalad fruitSalad) {
        super(fruitSalad);
    }

    @Override
    public String remark() {
        return super.remark() + "加份西瓜切\n";
    }

    @Override
    public int price() {
        return super.price() + 3;
    }
}
