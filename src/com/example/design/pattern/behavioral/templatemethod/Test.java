package com.example.design.pattern.behavioral.templatemethod;

public class Test {
  public static void main(String[] args) {
    AbstractCourse bCourse = new BCourse();
    bCourse.makeCourse();

    AbstractCourse dCourse = new DCourse(true);
    dCourse.makeCourse();
  }
}
