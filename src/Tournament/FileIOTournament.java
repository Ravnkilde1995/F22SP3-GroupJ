package Tournament;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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




    public static void saveGameData(ArrayList<Teams> teams, ArrayList<Tournament> tournaments) {
        String gameData = "";
        for (Teams t : teams) {
            gameData += "Team name: " + t.getTeamName() + "," + "Ranking: " + t.getPoints() + "," + "Goals: " + t.getNumberOfGoals() + "\n" ;
        }
        for (Tournament a : tournaments) {
            gameData += "Tournament start time: " + a.getStartTime() + "Tournament end time: " + a.getEndTime() + "Tournament date: " + a.getDate() + "Tournament name: " + a.getTournamentName();
        }
        try {
            FileWriter output = new FileWriter("src/tournament/data.txt");
            output.write(gameData);
            output.close();
        }
        catch (IOException e) {
        }
    }

    public static void loadGameData(ArrayList<Teams> teams, ArrayList<Tournament> tournaments) {
        File text = new File("src/tournament/data.txt");
        try {
            Scanner scanner = new Scanner(text);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
        }
    }
}
