package com.example.design.pattern.behavioral.templatemethod;

public abstract class AbstractCourse {
    protected final void makeCourse(){
        makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }
        packageCourse();

    }
    final void makeVideo(){
    System.out.println("make video");
    }
    final void writeArticle(){
    System.out.println("write article");
    }
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();
}
