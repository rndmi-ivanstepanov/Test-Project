package ru.stepanov.test_using_java_class_config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "\"Get Me Out\" - No Resolve1";
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
