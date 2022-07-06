package com.example.design.pattern.structural.facade;

public class QualifyService {
    public boolean isAvailable(Gift gift){
        System.out.println(gift.getName());
        return true;
    }
}
