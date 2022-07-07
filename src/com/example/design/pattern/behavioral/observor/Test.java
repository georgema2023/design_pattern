package com.example.design.pattern.behavioral.observor;

public class Test {
  public static void main(String[] args) {
    Course course = new Course("course name");
    Teacher teacher = new Teacher("teacher name");
    course.addObserver(teacher);
    Question question = new Question();
    question.setName("question name");
    question.setContent("question content");
    course.produceQuestion(course,question);
  }
}
