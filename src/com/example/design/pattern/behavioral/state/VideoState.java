package com.example.design.pattern.behavioral.state;

public abstract class VideoState {
    protected VideoContext videoContext;

    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
