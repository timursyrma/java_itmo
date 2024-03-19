package com.example.structural.adapter;

public class VLCPlayerAdapter implements AdvancedMediaPlayer {
    VLCPlayer vlcPlayer = new VLCPlayer();
    @Override
    public void playMP3(String filename) {
        // Do nothing
    }

    @Override
    public void playVLC(String filename) {
        vlcPlayer.play("vlc", filename);
    }
}
