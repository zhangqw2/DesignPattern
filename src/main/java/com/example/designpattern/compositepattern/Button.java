package com.example.designpattern.compositepattern;

/**
 * @author 张全伟
 */
public class Button extends AbstractMenuButton {
    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "按钮";
    }

    @Override
    public void print() {
        System.out.println(getName() + "【" + getType() + "】");
    }
}
