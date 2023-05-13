package ru.stepanov.hw;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.stepanov.hw.config.SpringConfig;
import ru.stepanov.hw.devices.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player.playMusic());
        context.close();
    }
}
