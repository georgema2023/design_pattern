package com.example.design.pattern.structural.adapter.objectadapter;

import com.example.design.pattern.structural.adapter.classadapter.Target;

public class ConcreteTarget implements Target {
  @Override
  public void request() { System.out.println("concrete target request");
  }
}
