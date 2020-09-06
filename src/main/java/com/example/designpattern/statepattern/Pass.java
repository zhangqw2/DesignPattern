package com.example.designpattern.statepattern;

/**
 *
 * 审核通过状态
 * @author zhangquanwei
 */
public class Pass implements ApplyState {
    /**
     * 状态变化处理操作
     */
    @Override
    public void changeHandle() {
        System.out.println("申请单已经审批通过，当前用户可以正常休假了。");
    }
}
