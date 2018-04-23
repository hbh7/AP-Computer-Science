package SportsTeam;

public class Baseball extends SportsTeam {

    private int homerunCount;
    private int RBICount;
    private int errorCount;

    public Baseball(String teamName) {
        super(teamName);
        this.homerunCount = 0;
        this.RBICount = 0;
        this.errorCount = 0;
    }


    public Baseball(String teamName, int gamesPlayed, int gamesWon, int gamesLost, int gamesTied, int homerunCount, int RBICount, int errorCount) {
        super(teamName, gamesPlayed, gamesWon, gamesLost, gamesTied);
        this.homerunCount = homerunCount;
        this.RBICount = RBICount;
        this.errorCount = errorCount;
    }

    public double homeRunsPerGame() {
        return Math.round((double)homerunCount/(double)getGamesPlayed() * 100.0) / 100.0;
    }

    public double rbisPerGame() {
        return Math.round((double)RBICount/(double)getGamesPlayed() * 100.0) / 100.0;
    }

    public double errorsPerGame() {
        return Math.round((double)errorCount/(double)getGamesPlayed() * 100.0) / 100.0;
    }

    public String toString() {
        return super.toString()
                + "\nHome Runs: " + homerunCount + ", Per Game: " + homeRunsPerGame()
                + "\nRBIs: " + RBICount + ", Per Game: " + rbisPerGame()
                + "\nErrors: " + errorCount + ", Per Game: " + errorsPerGame();
    }
}
