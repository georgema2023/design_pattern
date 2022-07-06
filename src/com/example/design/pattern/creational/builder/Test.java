package com.example.design.pattern.creational.builder;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("name").buildCourseVideo("video").build();
        System.out.println(course);
    }
}
