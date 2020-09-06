package com.example.designpattern.statepattern;

/**
 * 审核中状态
 * @author zhangquanwei
 */
public class Audit implements ApplyState {
    /**
     * 状态变化处理操作
     */
    @Override
    public void changeHandle() {
        System.out.println("申请单处于审核中状态，当用户查看申请单详情时跳转到详情页可以看到提交记录。");
    }
}
