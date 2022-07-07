package com.example.design.pattern.behavioral.state;

public class PauseState extends VideoState {
    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
    System.out.println("pause");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}
