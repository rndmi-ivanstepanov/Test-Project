package ru.stepanov.hw.test_using_java_class_config;

import java.util.ArrayList;
import java.util.List;


public class HipHop implements Music {

    @Override
    public String getSong() {
        return "\"Sing For The Moment\" - Eminem";
    }

    public void doInit() {
        System.out.println("Bean initialization");
    }

    public void doDestroy() {
        System.out.println("Bean destruction");
    }
}
