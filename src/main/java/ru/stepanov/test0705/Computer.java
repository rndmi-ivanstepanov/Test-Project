package ru.stepanov.test0705;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private final int id = 1;
    private MusicPlayer player;

    @Autowired
    public Computer(MusicPlayer player) {
        this.player = player;
    }

    public String toString() {
        return "Computer " + id + " is playing this song: " + player.playMusic(Genre.HIPHOP);
    }
}
