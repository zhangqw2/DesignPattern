package com.example.designpattern.singletonpattern;

/**
 * 双重同步锁单例模式,线程不安全
 * @author zhangquanwei
 */
public class LazyDoubleCheckSingleton {
    private static LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        //由于指令重排的原因，某些线程可能会获取到空对象，后续对该对象的操作将触发空指针异常。
        if (instance == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
