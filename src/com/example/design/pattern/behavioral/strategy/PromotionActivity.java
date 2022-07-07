package com.example.design.pattern.behavioral.strategy;

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void doPromotion(){
        promotionStrategy.doPromotion();
    }
}
