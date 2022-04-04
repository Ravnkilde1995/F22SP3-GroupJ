package Tournament;

import java.util.ArrayList;
import java.util.Scanner;

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

    public static void addGameToTournament(Match match) {
        gamesPlayed.add(match);
    }

    public static void createTournament(Scanner input, ArrayList<Teams> teams){
        System.out.println("Type tournament name");
        String tournamentName = input.next();
        System.out.println("Type in the date of the tournament");
        String date = input.next();
        System.out.println("Type in the start time of the tournament");
        int startTime = input.nextInt();
        System.out.println("Type in the end time of the tournament");
        int endTime = input.nextInt();
        System.out.println(date + " " + startTime + " " + endTime);
    }

    public static void showAllTeams(ArrayList<Teams> teams){
        System.out.println("All teams in the tournament:");
        for (Teams t : teams) {
            System.out.println(t);
        }
    }
}
