package ru.stepanov.hw;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.stepanov.hw.MusicPlayer;
import ru.stepanov.hw.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(player);
        context.close();
    }
}
