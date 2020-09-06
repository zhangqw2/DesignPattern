package com.example.designpattern.statepattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeaveApplyTest {

    @Test
    void stateTest(){
        //创建一个请假申请单
        LeaveApply leaveApply = new LeaveApply();

        leaveApply.setState(new UnAudited());
        leaveApply.update();

        leaveApply.setState(new Audit());
        leaveApply.update();

        leaveApply.setState(new Pass());
        leaveApply.update();

        leaveApply.setState(new NotPass());
        leaveApply.update();
    }

}