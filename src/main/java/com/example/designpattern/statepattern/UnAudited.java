package com.example.designpattern.statepattern;

/**
 * 未审核状态（待提交审核）
 */
public class UnAudited implements ApplyState {
    /**
     * 状态变化处理操作
     */
    @Override
    public void changeHandle() {
        System.out.println("申请单处于未审核状态，当用户查看申请单详情时直接跳转到编辑页。");
    }
}
