package com.example.design.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Video video = factory.getVideo();
        Article article = factory.getArticle();
        video.produce();
        article.produce();
    }
}
