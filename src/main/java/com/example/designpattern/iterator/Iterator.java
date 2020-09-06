package com.example.designpattern.iterator;

/**
 * 迭代器接口
 * @author zhangquanwei
 */
public interface Iterator {
    /**
     * 检测是否还有下一个元素
     * @return
     */
    public abstract boolean hasNext();

    /**
     * 获得下一个元素
     * @return
     */
    public abstract Object next();
}
