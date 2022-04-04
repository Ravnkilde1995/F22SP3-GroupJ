package Tournament;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIOTeams implements DataIOTeams {
    //Fields
    // ******************
    private int numberOfGoals;
    private int points;


    //Constructor
    //******************
    public FileIOTeams(int numberOfGoals, int points) {
    this.numberOfGoals=numberOfGoals;
    this.points=points;
    }


    //methods
    //******************
    @Override
    public void saveData() {

    }

    @Override
    public void loadData() {

    }

    @Override
    public String getTeamName() {
        return null;
    }

    @Override
    public void setTeamName(String teamName) {

    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

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

    public static void loadGameData(ArrayList<Teams>teams) {

    }
}


