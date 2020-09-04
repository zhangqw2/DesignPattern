package com.example.designpattern.adapterpattern;

/**
 * @author zhangquanwei
 */
public class RaspberryPieObjectAdaptor implements Pie{

    private Raspberry raspberry = new Raspberry();

    @Override
    public void make() {
        System.out.println("制作一个派");
        raspberry.addRaspberry();
    }
}
