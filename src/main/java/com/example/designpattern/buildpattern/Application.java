package com.example.designpattern.buildpattern;

/**
 * @author zhangquanwei
 */
public class Application {
    public static void main(String[] args) {
        ShopBuilder builder = new FruitShopBuilder();
        Dealer dealer = new Dealer();
        dealer.setBuilder(builder);

        Shop shop = dealer.build("XX水果店", "福州市XX区XX街XX号", "水果经营");
        System.out.println(shop);

        ShopInner shopInner = new ShopInner.ShopBuilder()
                .name("XX水果店")
                .location("福州市XX区XX街XX号")
                .type("水果经营")
                .build();
        System.out.println(shop);
    }
}
