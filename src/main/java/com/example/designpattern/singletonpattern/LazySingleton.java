package com.example.designpattern.singletonpattern;

/**
 *懒汉模式,线程不安全
 * @author zhangquanwei
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    /**
     * 私有构造，限制产生多个对象
     */
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            //高并发下,对象初始化需要时间，在内存中容易出现两个单例对象
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
