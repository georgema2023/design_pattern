package com.example.design.pattern.structural.facade;

public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PayService payService = new PayService();
    private ShipService shipService = new ShipService();


    public void giftExchange(Gift gift){
        if(qualifyService.isAvailable(gift)){
            if (payService.pay(gift)){
                String shipNo = shipService.ship(gift);
                System.out.println(shipNo);
            }
        }
    }
}
