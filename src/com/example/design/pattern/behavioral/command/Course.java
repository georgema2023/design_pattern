package com.example.design.pattern.behavioral.command;

public class Course {
  private String name;

  public Course(String name) {
    this.name = name;
  }

  public void open() {
    System.out.println(name + " open");
  }

  public void close() {
    System.out.println(name + " close");
  }
}
