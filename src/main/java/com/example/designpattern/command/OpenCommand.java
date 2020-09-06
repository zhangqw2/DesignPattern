package com.example.designpattern.command;

/**
 * @author zhangquanwei
 */
public class OpenCommand implements Command {

    private Application app;

    public OpenCommand(Application app){
        this.app = app;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        app.on();
    }
}
