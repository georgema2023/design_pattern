package com.example.design.pattern.behavioral.visitor;

public class BCourse extends Course {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
