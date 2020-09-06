package com.example.designpattern.mementopattern;

import lombok.Getter;

/**
 * 备忘录类
 * @author zhangquanwei
 */
@Getter
public class GameMemento {
    /** 步数 */
    private int playerSteps;

    /**
     * 备份步数
     * @param playerSteps
     */
    public GameMemento(int playerSteps){
        this.playerSteps = playerSteps;
    }
}
