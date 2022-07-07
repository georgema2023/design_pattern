package com.example.design.pattern.behavioral.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(BCourse course) {
    System.out.println(course.getName());
    }

    @Override
    public void visit(DCourse course) {
    System.out.println(course.getName()+" "+course.getPrice());
    }
}
