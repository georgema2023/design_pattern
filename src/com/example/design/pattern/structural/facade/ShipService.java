package com.example.design.pattern.structural.facade;

public class ShipService {
    public String ship(Gift gift){
        System.out.println(gift.getName());
        String shipNo = "1";
        return shipNo;
    }
}
