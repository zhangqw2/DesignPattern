package com.example.designpattern.singletonpattern;

/**
 * 加同步锁的懒汉模式,线程安全，但是比较耗资源
 * @author zhangquanwei
 */
public class LazySingletonSync {
    private static LazySingletonSync lazySingletonSync = null;

    private LazySingletonSync() {

    }

    public  static LazySingletonSync getInstance() {
        //对整个类进行加锁，即使运行内存中已经存在LazySingleton，调用其getInstance还是会上锁
        synchronized (LazySingletonSync.class){
            if (lazySingletonSync == null) {
                lazySingletonSync = new LazySingletonSync();
            }
        }
        return lazySingletonSync;
    }
}
