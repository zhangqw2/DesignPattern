package com.example.designpattern.singletonpattern;

/**
 * 双重同步锁单例模式
 * 确保了线程安全，并且当LazyDoubleCheckSingleton实例创建好后，后续再调用其getInstance方法不会上锁。
 * @author zhangquanwei
 */
public class LazyDoubleCheckVolatileSingleton {
    private volatile static LazyDoubleCheckVolatileSingleton instance = null;

    private LazyDoubleCheckVolatileSingleton() {

    }

    public static LazyDoubleCheckVolatileSingleton getInstance() {

        if (instance == null) {
            synchronized (LazyDoubleCheckVolatileSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckVolatileSingleton();
                }
            }
        }
        return instance;
    }
}
