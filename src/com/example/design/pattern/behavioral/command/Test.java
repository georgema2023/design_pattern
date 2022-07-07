package com.example.design.pattern.behavioral.command;

public class Test {
  public static void main(String[] args) {
    Course course = new Course("course");
    OpenCourseCommand openCourseCommand = new OpenCourseCommand(course);
    CloseCourseCommand closeCourseCommand = new CloseCourseCommand(course);

    Staff staff = new Staff();
    staff.addCommand(openCourseCommand);
    staff.addCommand(closeCourseCommand);

    staff.executeCommand();
  }
}
