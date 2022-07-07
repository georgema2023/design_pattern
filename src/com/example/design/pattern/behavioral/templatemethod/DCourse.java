package com.example.design.pattern.behavioral.templatemethod;

public class DCourse extends AbstractCourse {
    private boolean needWriteArticle;

    public DCourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
    System.out.println("D course");
    }

    @Override
    protected boolean needWriteArticle() {
        return needWriteArticle;
    }
}
