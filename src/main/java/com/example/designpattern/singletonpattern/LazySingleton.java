package com.example.designpattern.singletonpattern;

/**
 *懒汉模式,线程不安全
 * @author zhangquanwei
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
