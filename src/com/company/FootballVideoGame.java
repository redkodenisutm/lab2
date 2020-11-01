package com.company;
import java.util.Arrays;
public class FootballVideoGame extends Football{

    enum Platform {
        PC,
        MOBILE,
        XBOX,
        CONSOLE,
    }

    private Platform[] platform;

    public FootballVideoGame(String[] rules, FootballType footballType, Platform[] platform) {
        super("Football", rules, footballType);
        this.platform = platform;
    }

   public Platform[] getPlatform() {
        return platform;
   }

   public void setPlatform(Platform[] p) {
        platform = p;
   }

   public void printVideoGame() {
        this.printFootball();
       System.out.println("Platform: " + Arrays.toString(platform));
   }
}
