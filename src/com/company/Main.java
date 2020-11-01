package com.company;

public class Main {

    public static void main(String[] args) {
	    Song song = new Song("Imagination", "Foster The People");
        song.printSong();
        song.setPopularityStatus(true);
        song.printSong();

        String[] rules = {
                "22 players",
                "1 ball",
                "90 minutes", "" +
                "team who score a goal take 1 point",
                "won the team that scored most goals"
        };

        SportGame sportGame = new SportGame("Football;", rules);
        sportGame.printSport();
        sportGame.setIsOlympic(true);
        sportGame.printSport();


        Football football = new Football("Football", rules, Football.FootballType.CLASSIC);
        football.printFootball();

        FootballVideoGame.Platform[] platforms = {FootballVideoGame.Platform.PC};
        FootballVideoGame fifa = new FootballVideoGame(rules, Football.FootballType.CLASSIC, platforms);
        fifa.printVideoGame();
        fifa.setPlatform(new FootballVideoGame.Platform[]{FootballVideoGame.Platform.PC, FootballVideoGame.Platform.CONSOLE});
        fifa.printVideoGame();
    }
}
