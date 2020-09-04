package com.example.designpattern.bridgepattern;

/**
 * @author 张全伟
 */
public class JackStore extends Store {
    public JackStore(Pie pie) {
        super(pie);
    }

    @Override
    Pie makePie() {
        System.out.println("杰克的小店");
        return pie.makePie();
    }
}
