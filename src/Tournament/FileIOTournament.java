package Tournament;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FileIOTournament implements DataIOTournament{

    int totalRanking;

    public FileIOTournament (int totalRankings) {
        this.totalRanking = totalRankings;
    }

    @Override
    public void saveData() {

    }

    @Override
    public void loadData() {

    }

    @Override
    public void showAllTeams() {

    }

    @Override
    public void getStartTime() {

    }

    @Override
    public void setStartTime() {

    }

    @Override
    public void getEndTime() {

    }

    @Override
    public void setEndTime() {

    }

    @Override
    public void getDate() {

    }

    @Override
    public void setDate() {

    }

    public void totalRanking() {

    }

    public void getTotalRanking() {

    }

    public void setTotalRanking(int totalRanking) {
        this.totalRanking = totalRanking;
    }

    /*

    public static void saveGameData(ArrayList<Teams> teams) {
        String gameData = "";
        for (Teams p : teams) {
            gameData += "Team name: " + p.getTeamName() + "," + "Ranking: " + p.getPoints() + "," + "Goals: " + p.getNumberOfGoals() + "\n" ;
        }
        try {
            FileWriter output = new FileWriter("src/tournament/data.txt");
            output.write(gameData);
            output.close();
        }
        catch (IOException e) {
        }
    }

    */
}
