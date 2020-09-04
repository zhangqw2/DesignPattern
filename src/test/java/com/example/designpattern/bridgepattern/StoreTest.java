package com.example.designpattern.bridgepattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void bridgeTest(){
        Store samStore = new SamStore(new ApplePie());
        Pie samStorePie = samStore.makePie();
        samStorePie.getType();

        Store jackStore = new JackStore(new CarrotPie());
        Pie jackStorePie = jackStore.makePie();
        jackStorePie.getType();
    }

}