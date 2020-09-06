package com.example.designpattern.strategypattern;

/**
 * @author zhangquanwei
 */
public class FullReductionPromotionStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("满1000立减1");
    }
}
