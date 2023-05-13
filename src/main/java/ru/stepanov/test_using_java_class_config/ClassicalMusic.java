package ru.stepanov.test_using_java_class_config;

import ru.stepanov.test_using_xml_and_annotations.genres.Music;

import java.util.List;

public class ClassicalMusic implements Music {

    @Override
    public List<String> getSong() {
        return null;
    }
}
