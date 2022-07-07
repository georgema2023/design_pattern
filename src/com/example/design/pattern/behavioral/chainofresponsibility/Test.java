package com.example.design.pattern.behavioral.chainofresponsibility;

public class Test {
  public static void main(String[] args) {
    Approver articleApprover = new ArticleApprover();
    Approver videoApprover = new VideoApprover();

    Course course = new Course();
    course.setName("name");
    course.setArticle("article");
    course.setVideo("video");

    articleApprover.setNextApprover(videoApprover);
    articleApprover.deploy(course);
  }
}
