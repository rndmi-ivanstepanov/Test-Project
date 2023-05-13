package ru.stepanov.test_using_java_class_config;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music {
    private final List<String> rockMusicList = new ArrayList<>();

    @Override
    public List<String> getSong() {
        return rockMusicList;
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
