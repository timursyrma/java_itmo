package com.example.structural.adapter;

public interface MediaPlayer {
    void play(String audioType, String fileName);
}


class MP3Player implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
    }
}

class VLCPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            System.out.println("Playing vlc file: " + fileName);
        }
    }
}