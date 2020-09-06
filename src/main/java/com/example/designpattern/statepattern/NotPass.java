package com.example.designpattern.statepattern;

/**
 * 审核未通过状态
 */
public class NotPass implements ApplyState {
    /**
     * 状态变化处理操作
     */
    @Override
    public void changeHandle() {
        System.out.println("申请单未通过审核，当前用户不可以休假");
    }
}
