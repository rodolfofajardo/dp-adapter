package com.ixns;

import com.ixns.advancedmediaplayer.AdvancedMediaPlayer;
import com.ixns.advancedmediaplayer.Mp4Player;
import com.ixns.advancedmediaplayer.VlcPlayer;
import com.ixns.mediaplayer.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        audioType = audioType.toUpperCase();
        switch (audioType) {
            case "VLC" -> advancedMusicPlayer = new VlcPlayer();
            case "MP4" -> advancedMusicPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String fileName) {
        audioType = audioType.toUpperCase();
        switch (audioType) {
            case "VLC" -> advancedMusicPlayer.playVcl(fileName);
            case "MP4" -> advancedMusicPlayer.playMp4(fileName);
        }
    }
}
