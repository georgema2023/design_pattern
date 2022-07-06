package com.example.design.pattern.structural.decorator;

public abstract class ADecorator extends ACake {
    private ACake aCake;
    public ADecorator(ACake aCake){
        this.aCake = aCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aCake.cost();
    }
}
