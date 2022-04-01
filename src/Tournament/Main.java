package Tournament;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Teams> teams = new ArrayList<>();

        mainMenu(input, teams);
    }


    public static void mainMenu(Scanner input, ArrayList<Teams>teams){

        int answer=1;

        while(answer != 0){
            System.out.println("Press 1 to create a team");
            System.out.println("Press 2 to assign points to team");
            System.out.println("Press 0 to terminate the program");

            answer=input.nextInt();

            switch(answer){
                case 1:
                    createTeam(input, teams);
                    break;
                case 2:
                    addPointsToTeam(input, teams);
                    break;
                case 0:
                    System.out.println("Closing...");
                    break;


            }
        }
    }

    public static void createTeam(Scanner input, ArrayList<Teams> teams){
        System.out.println("Input team name: ");
        String teamName = input.next();
        System.out.println("Input team members: ");
        int teamMembers = input.nextInt();
        Teams ole = new Teams(teamName,teamMembers);
        teams.add(ole);
        System.out.println("You're new team: "+ole);
    }

    public static void addPointsToTeam(Scanner input, ArrayList<Teams>teams){
        System.out.println("Input the name of the team you want to add points to: ");
        String team = input.next();
        System.out.println("Assign the total value of points: ");
        int points = input.nextInt();
        for(int i=0; i< teams.size();i++){
            if(teams.get(i).getTeamName().equalsIgnoreCase(team)){
                teams.get(i).setPoints(points);
                System.out.println("Added points to: "+teams.get(i));
            }

        }

    }
}
