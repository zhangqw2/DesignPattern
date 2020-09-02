package com.example.designpattern.simplefactory;

/**
 * @author zhangquanwei
 */
public class FruitFactory {
    public  Fruit produce(String name){
        if("apple".equals(name)){
            return new Apple();
        }else{
            return null;
        }
    }
}
