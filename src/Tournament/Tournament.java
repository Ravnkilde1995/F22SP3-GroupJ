package Tournament;

import java.util.ArrayList;
import java.util.Scanner;

public class Tournament {
    //Fields
    // ******************
    private double startTime;
    private double endTime;
    private String date;
    private String tournamentName;
    static ArrayList<Match> gamesPlayed;

    //Constructor
    //******************
    public Tournament(String tournamentName, double startTime,double endTime, String date){
        this.startTime=startTime;
        this.endTime=endTime;
        this.date=date;
        this.tournamentName=tournamentName;
    }

    //Methods
    //******************
    public double getStartTime(){
        return startTime;
    }

    public void setStartTime(double startTime){
        this.startTime=startTime;
    }

    public double getEndTime(){
        return endTime;
    }

    public void setEndTime(double endTime){
        this.endTime=endTime;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public static void addGameToTournament(Match match) {
        gamesPlayed.add(match);
    }

    public static void showAllTeams(ArrayList<Teams> teams){
        System.out.println("All teams in the tournament:");
        for (Teams t : teams) {
            System.out.println(t);
        }
    }
}
