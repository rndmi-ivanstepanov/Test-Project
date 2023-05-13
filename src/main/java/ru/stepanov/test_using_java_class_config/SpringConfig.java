package ru.stepanov.test_using_java_class_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(hipHop(), rockMusic());
    }

}
