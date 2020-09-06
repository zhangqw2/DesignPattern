package com.example.designpattern.strategypattern;

/**
 * @author zhangquanwei
 */
public class DiscountPromotionStrategy implements PromotionStrategy {
    @Override
    public void promotion() {
        System.out.println("9.9折钜惠");
    }
}
