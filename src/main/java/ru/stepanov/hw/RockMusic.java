package ru.stepanov.hw;

import ru.stepanov.hw.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private final List<String> rockMusicList = new ArrayList<>();

    @Override
    public String getSong() {
        return "\"Get Me Out\" - No Resolve";
    }

    @PostConstruct
    public void doInit() {
        System.out.println("rock music bean initialization");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("rock music bean destruction");
    }
}
