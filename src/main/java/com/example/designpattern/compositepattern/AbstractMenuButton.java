package com.example.designpattern.compositepattern;

/**
 * @author 张全伟
 */
public abstract  class AbstractMenuButton {
    public void add(AbstractMenuButton abstractMenuButton) {
        throw new UnsupportedOperationException("不支持创建操作");
    }

    public String getName() {
        throw new UnsupportedOperationException("不支持名称获取");
    }

    public String getType() {
        throw new UnsupportedOperationException("不支持类型获取");
    }

    public String getIcon() {
        throw new UnsupportedOperationException("不支持图标");
    }

    public void print() {
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
