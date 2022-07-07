package com.example.design.pattern.behavioral.command;

public class CloseCourseCommand implements Command {
    Course course;

    public CloseCourseCommand(Course course) {
        this.course = course;
    }

    @Override
    public void execute() {
course.close();
    }
}
