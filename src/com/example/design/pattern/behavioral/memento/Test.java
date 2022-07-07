package com.example.design.pattern.behavioral.memento;

public class Test {
  public static void main(String[] args) {
    ArticleMementoManager articleMementoManager = new ArticleMementoManager();
    Article article = new Article("title", "content", "imgs");
    ArticleMemento articleMemento = article.saveToMemento();
    articleMementoManager.addMemento(articleMemento);

    System.out.println(article);

    article.setTitle("title1");
    article.setContent("content1");
    article.setImgs("imgs1");

    System.out.println(article);

    articleMemento = articleMementoManager.getMemento();
    article.undoFromMemento(articleMemento);

    System.out.println(article);
  }
}
