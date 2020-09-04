package com.example.designpattern.adapterpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaspberryPieAdaptorTest {

    @Test
    void adaptorTest(){
        Pie pie = new RaspberryPieAdaptor();
        pie.make();
    }

}