package com.example.designpattern.command;

/**
 * 语音助手
 * @author zhangquanwei
 */
public class Siri {

    private Command command;

    /**
     * 设置要执行的命令
     * @param command 命令
     */
    public void setCommand(Command command){
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void doCommand(){
        command.execute();
    }
}
