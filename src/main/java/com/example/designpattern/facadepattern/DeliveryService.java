package com.example.designpattern.facadepattern;

/**
 * 配送服务
 * @author zhangquanwei
 */
public class DeliveryService {
    public void delivery(Takeaway takeaway) {
        System.out.println(takeaway.getName() + "已由骑手XX接单，订单派送中");
    }
}
