package com.ixns;

import com.ixns.mediaplayer.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType.toUpperCase()) {
            case "MP3" -> System.out.println(
                    "Playing Mp3 file. Name: " + fileName);
            case "VLC", "MP4" -> {
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            }
            default -> System.out.println(
                    "Invalid Media. " + audioType + " format not supported");
        }
    }
}
