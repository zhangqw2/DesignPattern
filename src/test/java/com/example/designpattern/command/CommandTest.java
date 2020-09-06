package com.example.designpattern.command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    void commandTest(){
        Siri siri = new Siri();

        System.out.println("嘿 siri， 打开微信。");
        Application weChat = new WeChat();
        Command command = new OpenCommand(weChat);
        //siri传递命令
        siri.setCommand(command);
        siri.doCommand();

        System.out.println("嘿 siri，打开高德地图");
        Application amap = new AMap();
        command = new OpenCommand(amap);
        //siri传递命令
        siri.setCommand(command);
        siri.doCommand();
    }

}