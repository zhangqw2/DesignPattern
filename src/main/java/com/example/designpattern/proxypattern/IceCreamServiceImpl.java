package com.example.designpattern.proxypattern;

/**
 * @author 张全伟
 */
public class IceCreamServiceImpl implements IceCreamService{
    @Override
    public void makeIceCream(String fruit) {
        System.out.println("制作" + fruit + "冰淇淋");
    }
}
