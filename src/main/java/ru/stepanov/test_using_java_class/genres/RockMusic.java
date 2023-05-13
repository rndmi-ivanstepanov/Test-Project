package ru.stepanov.test_using_java_class.genres;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private final List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("Kryptonite - 3 Doors Down");
        rockMusicList.add("Smells like teen spirit - Nirvana");
        rockMusicList.add("Last Resort - Papa Roach");
    }

    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
