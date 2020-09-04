package com.example.designpattern.decoratorpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractDecoratorTest {



    @Test
    void decoratorTest(){
        // 点了份水果沙拉，并加了两份猕猴桃和一份西瓜，看看最终价格是多少？
        AbstractFruitSalad fruitSalad = new FruitSalad();
        fruitSalad = new WaterMelonDecorator(new KiwiDecorator(new KiwiDecorator(fruitSalad)));

        System.out.println(fruitSalad.remark() + "价格是：" + fruitSalad.price());
    }
}