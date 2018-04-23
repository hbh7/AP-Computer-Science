package SportsTeam;

public class Football extends SportsTeam {

    private int touchdownCount;
    private int interceptionCount;

    public Football(String teamName) {
        super(teamName);
        this.touchdownCount = 0;
        this.interceptionCount = 0;
    }

    public Football(String teamName, int gamesPlayed, int gamesWon, int gamesLost, int gamesTied, int touchdownCount, int interceptionCount) {
        super(teamName, gamesPlayed, gamesWon, gamesLost, gamesTied);
        this.touchdownCount = touchdownCount;
        this.interceptionCount = interceptionCount;
    }

    public double touchDownsPerGame() {
        return Math.round((double)touchdownCount/(double)getGamesPlayed() * 100.0) / 100.0;
    }

    public double interceptionsPerGame() {
        return Math.round((double)interceptionCount/(double)getGamesPlayed() * 100.0) / 100.0;
    }

    public String toString() {
        return super.toString()
                + "\nTouchdowns: " + touchdownCount + ", Touchdowns Per Game: " + touchDownsPerGame()
                + "\nInterceptions: " + interceptionCount + ", Per Game: " + interceptionsPerGame();
    }
}
