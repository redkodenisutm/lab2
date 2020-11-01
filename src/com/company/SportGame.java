package com.company;
import java.util.Arrays;


public class SportGame {
    private String name;
    private String[] rules;
    private boolean isOlympic;

    public SportGame(String name, String[] rules, boolean isOlympic) {
        this.name = name;
        this.rules = rules;
        this.isOlympic = isOlympic;
    }

    public SportGame(String name, String[] rules) {
        this.name = name;
        this.rules = rules;
    }

    public String getName() {
        return name;
    }

    public String[] getRules() {
        return rules;
    }

    public void setRules(String[] rules) {
        this.rules = rules;
    }

    public boolean getIsOlympic() {
        return isOlympic;
    }

    public void setIsOlympic(boolean status) {
        isOlympic = status;
    }

    public void printSport() {
        String olympic = isOlympic ? "yes" : "no";
        System.out.println("Sport name: " + name);
        System.out.println("Rules: " + Arrays.toString(rules));
        System.out.println("Olympic: " + olympic);
    }
}
