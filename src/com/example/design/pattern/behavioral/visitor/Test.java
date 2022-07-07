package com.example.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Course> courses = new ArrayList<>();
        BCourse bCourse = new BCourse();
        bCourse.setName("b course");

        DCourse dCourse = new DCourse();
        dCourse.setName("d course");
        dCourse.setPrice(1);

        courses.add(bCourse);
        courses.add(dCourse);

        courses.forEach(course -> course.accept(new Visitor()));


    }

}
