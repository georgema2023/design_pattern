package com.example.design.pattern.structural.flyweight;

public class Manager implements Employee {
    @Override
    public void report() {
    System.out.println(content);
    }
    private String department;
    private String content;

    public Manager(String department){
        this.department = department;
    }

    public void setContent(String content){
        this.content = content;
    }
}
