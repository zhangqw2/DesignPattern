package com.example.designpattern.singletonpattern;

/**
 * 枚举单例
 * 不仅可以防御序列化攻击，也可以防御反射攻击
 * @author zhangquanwei
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
