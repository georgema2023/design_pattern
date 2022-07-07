package com.example.design.pattern.behavioral.strategy;

public class Test {
  public static void main(String[] args) {
    PromotionActivity promotionActivity = new PromotionActivity(new APromotionStrategy());
    promotionActivity.doPromotion();
  }
}
