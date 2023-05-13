package ru.stepanov.test0705.genres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HipHop implements Music {
    private final List<String> hipHopList = new ArrayList<>();

    {
        hipHopList.add("Clouds - NF");
        hipHopList.add("Money long - kizaru");
        hipHopList.add("Bandana - Big Baby Tape");
    }

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
