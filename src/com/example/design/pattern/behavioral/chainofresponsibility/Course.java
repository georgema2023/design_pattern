package com.example.design.pattern.behavioral.chainofresponsibility;

public class Course {
    private String name;
    private String article;
    private String video;

    public String getName() {
        return name;
    }

    public String getArticle() {
        return article;
    }

    public String getVideo() {
        return video;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", article='" + article + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
