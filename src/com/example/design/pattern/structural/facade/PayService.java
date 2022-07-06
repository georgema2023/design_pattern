package com.example.design.pattern.structural.facade;

public class PayService {
    public boolean pay(Gift gift){
        System.out.println(gift.getName());
        return true;
    }
}
