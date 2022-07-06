package com.example.design.pattern.structural.decorator;

public class EggDecorator extends ADecorator {
    public EggDecorator(ACake aCake) {
        super(aCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" egg";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
