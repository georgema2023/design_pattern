package com.example.design.pattern.behavioral.command;

public class OpenCourseCommand implements Command {
    private Course course;

    public OpenCourseCommand(Course course) {
        this.course = course;
    }

    @Override
    public void execute() {
        course.open();
    }
}
