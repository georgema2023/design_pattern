package com.example.design.pattern.behavioral.chainofresponsibility;

public class ArticleApprover extends Approver {
  @Override
  public void deploy(Course course) {
    if (course.getArticle() != null) {
      System.out.println(course.getName() + " has article");
      if (approver != null) {
        approver.deploy(course);
      }
    } else {
      System.out.println(course.getName() + "does not have article");
      return;
    }
  }
}
