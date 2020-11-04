package com.example.designpattern.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediatorTest {

    @Test
    void execute() {
        AbstractMediator mediator = new Mediator();
        System.out.println("采购手机");
        Purchase purchase = mediator.purchase;
        purchase.buyPhone(100);
        System.out.println("销售手机");
        Sale sale = mediator.sale;
        sale.sellPhone(1);
        System.out.println("清理库存");
        Stock stock = mediator.stock;
        stock.clearStock();
    }
}