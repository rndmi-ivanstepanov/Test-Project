package ru.stepanov.hw.devices;

import org.springframework.beans.factory.annotation.Value;
import ru.stepanov.hw.genres.Music;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private final List<Music> playlist;

    public MusicPlayer(List<Music> playlist) {
        this.playlist = playlist;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random rnd = new Random();
        int songIndex = rnd.nextInt(playlist.size());

        return "Playing: " + playlist.get(songIndex).getSong()
                + " (volume = " + volume + ")";
    }

    @Override
    public String toString() {
        return "MusicPlayer: " + name + ", volume - " + volume;
    }
}
