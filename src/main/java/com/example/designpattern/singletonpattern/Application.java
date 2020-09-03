package com.example.designpattern.singletonpattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangquanwei
 */
public class Application {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 演示序列化破坏单例
        HungrySingletonSerial instance = HungrySingletonSerial.getInstance();
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file"));
        outputStream.writeObject(instance);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file"));
        HungrySingletonSerial newInstance = (HungrySingletonSerial) inputStream.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

        //演示反射破坏单例
        HungrySingleton instance1 = HungrySingleton.getInstance();
        // 反射创建实例
        Class<HungrySingleton> c = HungrySingleton.class;
        // 获取构造器
        Constructor<HungrySingleton> constructor = c.getDeclaredConstructor();
        // 打开构造器权限
        constructor.setAccessible(true);
        HungrySingleton newInstance1 = constructor.newInstance();

        System.out.println(instance1);
        System.out.println(newInstance1);
        System.out.println(instance1 == newInstance1);

    }
}
