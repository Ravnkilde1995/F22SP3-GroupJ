package Tournament;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Teams> teams = new ArrayList<>();

        mainMenu(input, teams);

    }


    public static void teamMenu(Scanner input, ArrayList<Teams>teams){

        int answer=1;

        while(answer != 0){
            System.out.println("Press 1 to create a team");
            System.out.println("Press 2 to assign points to team");
            System.out.println("Press 3 to assign goals to team");
            System.out.println("Press 4 to add negative goals from team");
            System.out.println("Press 0 to terminate the program");

            answer=input.nextInt();

            switch(answer){
                case 1:
                    createTeam(input, teams);
                    break;
                case 2:
                    addPointsToTeam(input, teams);
                    break;
                case 3:
                    addGoalsToTeam(input, teams);
                    break;
                case 4:
                    addNegativeGoals(input, teams);
                    break;
                case 0:
                    System.out.println("Closing...");
                    break;
            }
        }
    }

    public static void mainMenu(Scanner input, ArrayList<Teams>teams){

        int answer=1;

        while(answer != 0){
            System.out.println("Press 1 for \"Team menu\"");
            System.out.println("Press 2 for \"Tournament menu\"");
            System.out.println("Press 3 for \"Match menu\"");
            System.out.println("Press 0 to terminate the program");

            answer=input.nextInt();

            switch(answer){
                case 1:
                    teamMenu(input, teams);
                    break;
                case 2:
                    System.out.println("Coming soon");
                    break;
                case 3:
                    System.out.println("also Coming soon");
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

    public static void addGoalsToTeam(Scanner input, ArrayList<Teams>teams){
        System.out.println("Input the name of the team you want to add goals to: ");
        String team = input.next();
        System.out.println("Assign the total value of goals: ");
        int goals = input.nextInt();
        for(int i=0; i< teams.size();i++){
            if(teams.get(i).getTeamName().equalsIgnoreCase(team)){
                int negativeGoals=teams.get(i).getNumberOfGoalsNegative();
                goals=goals-negativeGoals;
                teams.get(i).setNumberOfGoals(goals);
                System.out.println("Added goals to: "+teams.get(i));
            }

        }
    }

    public static void addNegativeGoals(Scanner input, ArrayList<Teams>teams){
        System.out.println("Input the name of the team you want to extract goals from: ");
        String team = input.next();
        System.out.println("extract the total value of goals: ");
        int goals = input.nextInt();
        for(int i=0; i< teams.size();i++){
            if(teams.get(i).getTeamName().equalsIgnoreCase(team)){
                teams.get(i).setNumberOfGoalsNegative(goals);
                System.out.println("extracted goals from: "+teams.get(i));
            }

        }
    }
}
