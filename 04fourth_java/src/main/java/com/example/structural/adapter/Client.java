package com.example.structural.adapter;

public class Client {
    public static void main(String[] args) {
        AdvancedMediaPlayer mp3Player = new MP3PlayerAdapter();
        mp3Player.playMP3("song.mp3");

        AdvancedMediaPlayer vlcPlayer = new VLCPlayerAdapter();
        vlcPlayer.playVLC("song.vlc");
    }
}
