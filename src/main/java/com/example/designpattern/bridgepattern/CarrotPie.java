package com.example.designpattern.bridgepattern;

/**
 * @author 张全伟
 */
public class CarrotPie implements Pie{
    @Override
    public Pie makePie() {
        System.out.println("制作胡萝卜派");
        return new CarrotPie();
    }

    @Override
    public void getType() {
        System.out.println("蔬菜沙拉派");
    }
}
