package com.example.design.pattern.structural.decorator;

public class Test {
  public static void main(String[] args) {
    ACake aCake;
    aCake = new Cake();
    aCake = new EggDecorator(aCake);
    aCake = new EggDecorator(aCake);
    aCake = new SausageDecorator(aCake);
    System.out.println(aCake.getDesc()+" "+aCake.cost());
  }
}
