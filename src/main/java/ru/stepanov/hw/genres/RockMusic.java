package ru.stepanov.hw.genres;

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
}
