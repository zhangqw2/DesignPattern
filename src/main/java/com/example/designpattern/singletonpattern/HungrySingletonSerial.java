package com.example.designpattern.singletonpattern;

import java.io.Serializable;

/**
 * 序列化破坏单例模式
 * @author zhangquanwei
 */
public class HungrySingletonSerial implements Serializable {

    private static final long serialVersionUID = 6430498463920256108L;

    private final static HungrySingletonSerial instance = new HungrySingletonSerial();


    private HungrySingletonSerial() {

    }

    public static HungrySingletonSerial getInstance() {
        return instance;
    }

//    /**
//     * 保证反序列化后的对象和序列化前的对象是同一个对象
//     * @return
//     */
//    private Object readResolve() {
//        return instance;
//    }
}
