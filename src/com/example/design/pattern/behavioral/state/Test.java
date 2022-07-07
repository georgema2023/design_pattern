package com.example.design.pattern.behavioral.state;

public class Test {
  public static void main(String[] args) {
    VideoContext videoContext = new VideoContext();
    videoContext.setVideoState(new PlayState());
    System.out.println(videoContext.getVideoState().getClass().getSimpleName());
    videoContext.pause();
    System.out.println(videoContext.getVideoState().getClass().getSimpleName());
    videoContext.speed();
    System.out.println(videoContext.getVideoState().getClass().getSimpleName());
    videoContext.stop();
    System.out.println(videoContext.getVideoState().getClass().getSimpleName());
    videoContext.speed();
  }
}
