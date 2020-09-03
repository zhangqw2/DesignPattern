package com.example.designpattern.decoratorpattern;

/**
 * 水果沙拉实体
 * @author zhangquanwei
 */
public class FruitSalad extends AbstractFruitSalad {
    @Override
    public String remark() {
        return "水果（标准）\n";
    }

    @Override
    public int price() {
        return 9;
    }
}
