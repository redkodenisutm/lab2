package com.company;

import java.util.Arrays;

public class Football extends SportGame{

    enum FootballType {
        CLASSIC,
        FUTSAL,
        BEACH,
        STREET
    }

    private FootballType footballType = FootballType.CLASSIC;

    public Football(String name, String[] rules, FootballType footballType) {
        super(name, rules);
        this.footballType = footballType;
    }

    public Football(String name, String[] rules) {
        super(name, rules);
    }

    public FootballType getFootballType() {
        return footballType;
    }

    public void setFootballType(FootballType t) {
        footballType = t;
    }

    public void printFootball() {
        this.printSport();
        System.out.println("Type: " + footballType);
    }
}
