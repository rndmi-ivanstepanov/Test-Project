package ru.stepanov.hw.test_using_java_class_config;


public class Computer {
    private final int id = 1;
    private MusicPlayer player;

    public Computer(MusicPlayer player) {
        this.player = player;
    }

//    public String toString() {
//        return "Computer " + id + " is playing this song: " + player.playMusic(Genre.HIPHOP);
//    }
}
