package ru.stepanov.test_using_xml_and_annotations;

import org.springframework.beans.factory.annotation.Autowired;


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
