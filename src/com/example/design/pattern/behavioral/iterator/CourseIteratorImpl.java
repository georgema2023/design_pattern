package com.example.design.pattern.behavioral.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {
  private List<Course> courses;
  private int position;
  private Course course;

  public CourseIteratorImpl(List<Course> courses) {
    this.courses = courses;
  }

  @Override
  public Course nextCourse() {
    course = courses.get(position);
    position++;
    System.out.println("" + position);
    return null;
  }

  @Override
  public boolean isLastCourse() {
    if (position < courses.size()) {
      return false;
    } else {
      return true;
    }
  }
}
