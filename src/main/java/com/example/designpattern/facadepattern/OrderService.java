package com.example.designpattern.facadepattern;

/**
 * 下单服务
 * @author zhangquanwei
 */
public class OrderService {
    public boolean placeAnOrder(Takeaway takeaway) {
        System.out.println(takeaway.getName() + "下单成功");
        return true;
    }
}
