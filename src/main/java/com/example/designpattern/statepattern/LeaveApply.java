package com.example.designpattern.statepattern;

/**
 * 休假申请
 * @author zhangquanwei
 */
public class LeaveApply {
    /**
     * 休假申请单初始状态是待提交状态
     */
    private ApplyState applyState = new UnAudited();

    /**
     * 设置状态
     * @param state
     */
    public void setState(ApplyState state){
        applyState = state;
    }

    /**
     * 状态变化后，更新对象自身的行为
     */
    public void update(){
        applyState.changeHandle();
    }

}