package com.example.designpattern.facadepattern;

/**
 * 聚合service
 * @author zhangquanwei
 */
public class TakeawayService {
    private OrderService orderService = new OrderService();
    private PayService payService = new PayService();
    private DeliveryService deliveryService = new DeliveryService();

    public void takeOrder(Takeaway takeaway) {
        if (orderService.placeAnOrder(takeaway)) {
            if (payService.pay(takeaway)) {
                deliveryService.delivery(takeaway);
            }
        }
    }
}
