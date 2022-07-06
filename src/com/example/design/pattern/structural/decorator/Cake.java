package com.example.design.pattern.structural.decorator;

public class Cake extends ACake {
    @Override
    protected String getDesc() {
        return "cake";
    }

    @Override
    protected int cost() {
        return 1;
    }
}
