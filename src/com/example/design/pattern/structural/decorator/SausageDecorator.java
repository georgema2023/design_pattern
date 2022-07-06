package com.example.design.pattern.structural.decorator;

public class SausageDecorator extends ADecorator {
    public SausageDecorator(ACake aCake) {
        super(aCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" sausage";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
