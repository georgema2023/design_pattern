package com.example.design.pattern.behavioral.observor;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
    System.out.println(name+" "+ course.getName()+" "+question.getContent());
    }
}
