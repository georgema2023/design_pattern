package com.example.design.pattern.behavioral.observor;

import java.util.Observable;

public class Course extends Observable {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void produceQuestion(Course course,Question question){
    System.out.println(question.getName()+" "+course.name);
    setChanged();
    notifyObservers(question);
    }
}
