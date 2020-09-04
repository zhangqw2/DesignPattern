package com.example.designpattern.flyweightpattern;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class FruitPieFactoryTest {
    private static final String[] PIE = {"葡萄派", "苹果派", "草莓派", "樱桃派"};
    @Test
    void test(){
        IntStream.range(0, 10).forEach((i) -> {
            String name = PIE[(int) (Math.random() * PIE.length)];
            FruitPie fruitPie = FruitPieFactory.produce(name);
            fruitPie.setProductTime(LocalDateTime.now());
            fruitPie.make();
        });
    }

}