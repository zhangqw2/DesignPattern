package com.example.designpattern.bridgepattern;

/**
 * @author 张全伟
 */
public class ApplePie implements Pie {
    @Override
    public Pie makePie() {
        System.out.println("制作苹果派");
        return new ApplePie();
    }

    @Override
    public void getType() {
        System.out.println("水果派");
    }
}
