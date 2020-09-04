package com.example.designpattern.adapterpattern;

/**
 * @author zhangquanwei
 */
public class RaspberryPieAdaptor extends Raspberry implements Pie{

    @Override
    public void make() {
        System.out.println("制作一个派");
        super.addRaspberry();
    }
}
