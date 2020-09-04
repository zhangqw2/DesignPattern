package com.example.designpattern.proxypattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieServiceProxyTest {

    @Test
    void staticProxy(){
        PieServiceProxy proxy = new PieServiceProxy();
        proxy.makePie();
    }
}