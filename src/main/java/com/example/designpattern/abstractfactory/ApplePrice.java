package com.example.designpattern.abstractfactory;

/**
 * @author zhangquanwei
 */
public class ApplePrice extends Price {

    @Override
    public void pay() {
        System.out.println("单价2元");
    }
}
