package com.example.designpattern.observerpattern;

import java.util.Observable;

/**
 * @author zhangquanwei
 */
public class Blog extends Observable {
    private String title;

    public Blog(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void comment(Comment comment) {

        System.out.println(comment.getNickname() + "评论了<" + this.title + "> ，" +
                "评论内容：" + comment.getValue());
        // 设置标识位 changed = true，表示被观察者发生了改变
        setChanged();
        // 通知观察者，可以给观察者传递数据
        notifyObservers(comment);
    }
}
