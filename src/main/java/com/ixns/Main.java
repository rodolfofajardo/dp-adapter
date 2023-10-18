package com.ixns;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "With or Without you");
        audioPlayer.play("mp4", "Black");
        audioPlayer.play("vlc", "Over the rainbow");
        audioPlayer.play("avi", "Something");
    }
}