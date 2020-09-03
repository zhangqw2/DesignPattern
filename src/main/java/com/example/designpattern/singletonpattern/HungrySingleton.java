package com.example.designpattern.singletonpattern;

/**
 * 饿汉模式,类加载时就初始化
 * @author zhangquanwei
 */
public class HungrySingleton {
    private final static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        //饿汉模式下，可以添加判断，阻止反射破坏单例
        if (instance != null) {
            throw new RuntimeException("forbidden");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
