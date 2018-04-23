package SportsTeam;
//
// Code written by hbh7
// hbh7.com
// github.com/hbh7/AP-Computer-Science
//
// Chapter 11: Classes Continued
// Inheritance: SportsTeam
// SportsTeam.java
//
public class SportsTeam
{
    private String teamName;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int gamesTied;

    public SportsTeam(String teamName) {
        this.teamName = teamName;
        gamesPlayed = 0;
        gamesWon = 0;
        gamesLost = 0;
        gamesTied = 0;
    }

    public SportsTeam(String teamName, int gamesPlayed, int gamesWon, int gamesLost, int gamesTied) {
        this.teamName = teamName;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.gamesTied = gamesTied;
    }

    public int getWinningPercentage() {
        if(gamesPlayed == 0) {
            return 0;
        } else {
            return (int) ((((double) gamesWon / (double) gamesPlayed) * 100) + 0.5);
        }
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public int getGamesTied() {
        return gamesTied;
    }

    public void playGame(String option) {
        if ("w".equalsIgnoreCase(option)) {
            gamesWon++;
        } else if ("l".equalsIgnoreCase(option)) {
            gamesLost++;

        } else {
            gamesTied++;

        }
        gamesPlayed++;
    }

    public String toString() {
        return "----------\n"
                + "Team Name: " + teamName
                + "\nGames Played: " + gamesPlayed
                + "\nGames Won: " + gamesWon
                + "\nGames Lost: " + gamesLost
                + "\nGames Tied: " + gamesTied
                + "\nWinning Percentage: " + getWinningPercentage() + "%";
    }
}
