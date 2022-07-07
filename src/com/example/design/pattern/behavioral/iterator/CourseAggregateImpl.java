package com.example.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {
    private List<Course> courses;

    public CourseAggregateImpl() {
        this.courses = new ArrayList();
    }


    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courses);
    }
}
