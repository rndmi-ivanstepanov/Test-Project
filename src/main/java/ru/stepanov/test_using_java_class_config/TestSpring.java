package ru.stepanov.test_using_java_class_config;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
