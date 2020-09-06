package com.example.designpattern.observerpattern;

import java.util.Observable;
import java.util.Observer;

public class Author implements Observer {

    private String name;

    public Author(String name) {
        this.name = name;
    }

    /**
     * 观察者被通知后，就会调用这个方法
     *
     * @param o   被观察者对象
     * @param arg 被观察者传递过来的数据
     */
    @Override
    public void update(Observable o, Object arg) {
        Blog blog = (Blog) o;
        Comment comment = (Comment) arg;
        System.out.println("系统感知到" + this.name + "撰写的博文<" +
                blog.getTitle() + ">收到了" + comment.getNickname() +
                "的评论，评论内容为：" + comment.getValue());
    }
}
