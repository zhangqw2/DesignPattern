package com.example.designpattern.iterator;

/**
 * 只有实现此接口的才可以获得迭代器对象
 * @author zhangquanwei
 */
public interface Aggregate {
    /**
     * 获得迭代器对象
     * @return
     */
    public abstract Iterator iterator();
}
