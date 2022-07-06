package com.example.design.pattern.structural.adapter.classadapter;

public class ConcreteTarget implements Target {
  @Override
  public void request() { System.out.println("concrete target request");
  }
}
