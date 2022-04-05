package Tournament;

import java.util.ArrayList;
import java.util.Scanner;

public class Tournament {
    //Fields
    // ******************
    private  int startTime;
    private int endTime;
    private String date;
    private String tournamentName;
    static ArrayList<Match> gamesPlayed;

    //Constructor
    //******************
    public Tournament( int startTime,int endTime, String date, String tournamentName){
        this.startTime=startTime;
        this.endTime=endTime;
        this.date=date;
        this.tournamentName=tournamentName;
    }

    //Methods
    //******************
    public int getStartTime(){
        return startTime;
    }

    public void setStartTime(int startTime){
        this.startTime=startTime;
    }

    public int getEndTime(){
        return endTime;
    }

    public void setEndTime(int endTime){
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
