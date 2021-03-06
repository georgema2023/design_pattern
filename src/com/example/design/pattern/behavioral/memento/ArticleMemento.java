package com.example.design.pattern.behavioral.memento;

public class ArticleMemento {
  private String title, content, imgs;

  public ArticleMemento(String title, String content, String imgs) {
    this.title = title;
    this.content = content;
    this.imgs = imgs;
  }

  public String getTitle() {
    return title;
  }

  public String getContent() {
    return content;
  }

  public String getImgs() {
    return imgs;
  }
}
