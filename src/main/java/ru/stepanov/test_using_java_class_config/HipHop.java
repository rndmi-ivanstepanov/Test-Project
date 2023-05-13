package ru.stepanov.test_using_java_class_config;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class HipHop implements Music {
    private final List<String> hipHopList = new ArrayList<>();

    @Override
    public List<String> getSong() {
        return hipHopList;
    }

    public void doInit() {
        System.out.println("Bean initialization");
    }

    public void doDestroy() {
        System.out.println("Bean destruction");
    }
}
