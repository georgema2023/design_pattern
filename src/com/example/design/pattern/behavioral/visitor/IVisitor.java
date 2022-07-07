package com.example.design.pattern.behavioral.visitor;

public interface IVisitor {
    void visit(BCourse course);
    void visit(DCourse course);
}
