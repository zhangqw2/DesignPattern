package com.example.designpattern.singletonpattern;

/**
 *
 * 1.JVM在类的初始化阶段会加Class对象初始化同步锁，同步多个线程对该类的初始化操作；
 * 2.静态内部类InnerClass的静态成员变量instance在方法区中只会有一个实例。
 * @author zhangquanwei
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }

    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }
}
