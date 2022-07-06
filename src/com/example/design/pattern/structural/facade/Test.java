package com.example.design.pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        Gift gift = new Gift("name");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(gift);
    }
}
