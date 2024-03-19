package com.example.structural.adapter;

public class MP3PlayerAdapter implements AdvancedMediaPlayer {
    MP3Player mp3Player = new MP3Player();

    @Override
    public void playMP3(String filename) {
        mp3Player.play("mp3", filename);
    }

    @Override
    public void playVLC(String filename) {
        // Do nothing
    }
}
