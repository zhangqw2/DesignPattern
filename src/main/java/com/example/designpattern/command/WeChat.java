package com.example.designpattern.command;

/**
 * 微信
 * @author zhangquanwei
 */
public class WeChat extends Application{


    /**
     * 打开应用
     */
    @Override
    public void on() {
        System.out.println("微信打开了！");
    }
}
