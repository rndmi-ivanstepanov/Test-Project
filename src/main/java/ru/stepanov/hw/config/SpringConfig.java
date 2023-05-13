package ru.stepanov.hw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.stepanov.hw.devices.MusicPlayer;
import ru.stepanov.hw.genres.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.stepanov.test_using_java_class_config")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public HipHop hipHop() {
        return new HipHop();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public TranceMusic tranceMusic() {
        return new TranceMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public List<Music> playlist() {
        return new ArrayList<>(List.of(
                rockMusic(),
                hipHop(),
                classicalMusic(),
                tranceMusic()
        ));
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(playlist());
    }



}
