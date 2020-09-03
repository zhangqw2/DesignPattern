package com.example.designpattern.buildpattern;

import lombok.Data;

/**
 * @author zhangquanwei
 */
@Data
public class Shop {
    private String name;
    private String location;
    private String type;

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
