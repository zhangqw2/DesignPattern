package com.example.designpattern.buildpattern;

import lombok.Data;

/**
 * @author zhangquanwei
 */
@Data
public class ShopInner {
    private String name;
    private String location;
    private String type;

    public ShopInner(ShopBuilder shopBuilder){
        this.name = shopBuilder.name;
        this.location = shopBuilder.location;
        this.type = shopBuilder.type;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static class ShopBuilder {
        private String name;
        private String location;
        private String type;

        public ShopBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ShopBuilder location(String location) {
            this.location = location;
            return this;
        }

        public ShopBuilder type(String type) {
            this.type = type;
            return this;
        }

        public ShopInner build() {
            return new ShopInner(this);
        }
    }
}
