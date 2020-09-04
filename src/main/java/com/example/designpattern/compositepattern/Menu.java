package com.example.designpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张全伟
 */
public class Menu extends AbstractMenuButton {
    private List<AbstractMenuButton> items = new ArrayList<>();
    private String name;
    private String icon;
    private Integer level;

    public Menu(String name, String icon, Integer level) {
        this.name = name;
        this.icon = icon;
        this.level = level;
    }

    @Override
    public void add(AbstractMenuButton abstractMenuButton) {
        items.add(abstractMenuButton);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "菜单";
    }

    @Override
    public String getIcon() {
        return this.icon;
    }

    @Override
    public void print() {
        System.out.println(getIcon() + getName() + "【" + getType() + "】");
        for (AbstractMenuButton item : items) {
            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("    ");
                }
            }
            item.print();
        }
    }
}
