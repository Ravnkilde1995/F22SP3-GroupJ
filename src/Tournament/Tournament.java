package Tournament;

import java.util.ArrayList;

public class Tournament {
    //Fields
    // ******************
    private double startTime;
    private double endTime;
    private String date;
    ArrayList<Match> gamesPlayed;

    //Constructor
    //******************
    public Tournament(double startTime,double endTime, String date){
    this.startTime=startTime;
    this.endTime=endTime;
    this.date=date;

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

    public void addGameToTournament(){

    }

    public void createTournament(){

    }

    public void showAllTeams(){

    }
}
