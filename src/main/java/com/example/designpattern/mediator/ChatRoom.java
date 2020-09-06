package com.example.designpattern.mediator;

import java.util.Date;

/**
 * @author zhangquanwei
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
