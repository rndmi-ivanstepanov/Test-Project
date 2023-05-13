package ru.stepanov.test0705;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        MusicPlayer firstPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        Music rapMusicBean = (context.getBean("hipHop", Music.class));

//
//        System.out.println(player.playMusic());

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

//        System.out.println(player.getVolume());
//        System.out.println(player.getName());

//        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(player == player2);
        context.close();
    }
}
