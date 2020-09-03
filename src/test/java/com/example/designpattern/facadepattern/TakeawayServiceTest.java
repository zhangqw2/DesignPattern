package com.example.designpattern.facadepattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeawayServiceTest {

    @Test
    public void takeWayService(){
        Takeaway takeaway = new Takeaway();
        takeaway.setName("泡椒");

        TakeawayService takeawayService = new TakeawayService();
        takeawayService.takeOrder(takeaway);
    }

}