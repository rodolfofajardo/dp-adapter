package com.ixns.advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVcl(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
