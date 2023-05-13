package ru.stepanov.test_using_java_class;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.stepanov.test_using_java_class.genres.Music;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
@Scope("prototype")
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("hipHop") Music music2
                       ) {
        this.music1 = music1;
        this.music2 = music2;
    }

    @PostConstruct
    public void doInit() {
        System.out.println("Music player bean initialization");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Music player bean destruction");
    }

    public String playMusic(Genre genre) {
        Random rnd = new Random();
        int songIndex = rnd.nextInt(3);

        if (genre == Genre.ROCK) {
            return music1.getSong().get(songIndex);
        }
        return music2.getSong().get(songIndex);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
