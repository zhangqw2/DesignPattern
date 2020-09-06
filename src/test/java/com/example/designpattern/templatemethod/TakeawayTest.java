package com.example.designpattern.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TakeawayTest {

    @Test
    void templateTest(){
        Takeaway barbecue = new BarbecueTakeaway(true);
        barbecue.flow();

        FruitTakeaway fruit = new FruitTakeaway();
        fruit.flow();
    }

}