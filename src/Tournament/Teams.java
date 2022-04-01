package Tournament;

import java.util.ArrayList;
import java.util.Scanner;

public class Teams {
    //Fields
    // ******************
    private String teamName;
    private int teamMembers;
    private int numberOfGoals;
    private int points;

    //Constructor
    //******************
    public Teams(String teamName, int teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    //Methods
    //******************
    public String getTeamName(){
        return teamName;
    }

    public void setTeamName(String teamName){
        this.teamName=teamName;
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

    public int getTeamMembers(){
        return teamMembers;
    }

    public void setTeamMembers(int teamMembers){
        this.teamMembers=teamMembers;

    }


    @Override
    public String toString() {
        return "Teams{" +
                "teamName='" + teamName + '\'' +
                ", teamMembers=" + teamMembers +
                ", numberOfGoals=" + numberOfGoals +
                ", points=" + points +
                '}';
    }
}