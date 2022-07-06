package com.example.design.pattern.structural.adapter.objectadapter;


public class Test {
  public static void main(String[] args) {
    com.example.design.pattern.structural.adapter.classadapter.Target target = new ConcreteTarget();
    target.request();
    Target adapterTarget = new Adapter();
    adapterTarget.request();
  }
}
