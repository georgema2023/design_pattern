package com.example.design.pattern.behavioral.state;

public class StopState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
    System.out.println("Error can not speed");
    }

    @Override
    public void pause() {
        System.out.println("Error can not pause");
    }

    @Override
    public void stop() {
    System.out.println("stop");
    }
}
