package com.ixns.advancedmediaplayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVcl(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
