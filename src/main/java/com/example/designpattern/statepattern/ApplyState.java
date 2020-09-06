package com.example.designpattern.statepattern;

/**
 * 审批单状态接口
 */
public interface ApplyState {

    /**
     * 状态变化处理操作
     */
    void changeHandle();

}
