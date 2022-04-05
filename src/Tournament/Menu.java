package Tournament;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Menu {


    public static void teamMenu(Scanner input, ArrayList<Teams> teams) {

        int answer = 1;

        while (answer != 0) {
            System.out.println("Press 1 to create a team");
            System.out.println("Press 2 to assign points to team");
            System.out.println("Press 3 to assign goals and negative goals to team");
            System.out.println("Press 4 to show all teams assigned to tournament");
            System.out.println("Press 0 to return to main menu");

            answer = input.nextInt();

            switch (answer) {
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
                    showAllTeams(teams);
                    break;
                case 0:
                    System.out.println("returning to main menu...");
                    break;
            }
        }
    }

    public static void mainMenu(Scanner input, ArrayList<Teams> teams, ArrayList<Match> matches, ArrayList<Tournament> tournaments) {

        int answer = 1;

        while (answer != 0) {
            System.out.println("Press 1 for \"Team menu\"");
            System.out.println("Press 2 for \"Tournament menu\"");
            System.out.println("Press 3 for \"Match menu\"");
            System.out.println("Press 0 to terminate the program");

            answer = input.nextInt();

            switch (answer) {
                case 1:
                    teamMenu(input, teams);
                    break;
                case 2:
                    tournamentMenu(input, teams, tournaments);
                    break;
                case 3:
                    matchMenu(input, matches, teams);
                    break;
                case 0:
                    System.out.println("Closing...");
                    break;
            }
        }
    }

    public static void tournamentMenu(Scanner input, ArrayList<Teams> teams, ArrayList<Tournament> tournaments) {

        int answer = 1;

        while (answer != 0) {
            System.out.println("Press 1 to create tournament");
            System.out.println("Press 2 to show the placement of teams");
            System.out.println("Press 3 to add games to tournament ");
            System.out.println("Press 4 to show all tournaments");
            System.out.println("Press 0 to return to main menu");

            answer = input.nextInt();

            switch (answer) {
                case 1:
                    createTournament(input, tournaments);
                    break;
                case 2:
                    showPlacement(teams);
                    break;
                case 3:
                    addGameToTournament();
                    break;
                case 4:
                    showTournaments(tournaments);
                    break;
                case 0:
                    System.out.println("returning to main menu...");
                    break;
            }
        }
    }

    public static void matchMenu(Scanner input, ArrayList<Match> matches, ArrayList<Teams> teams) {

        int answer = 1;

        while (answer != 0) {
            System.out.println("Press 1 for to create a match");
            System.out.println("Press 2 for show all upcoming matches");
            System.out.println("Press 0 to terminate the program");

            answer = input.nextInt();

            switch (answer) {
                case 1:
                    createMatch(input, matches, teams);
                    break;
                case 2:
                    showAllMatches(matches);
                    break;
                case 0:
                    System.out.println("Closing...");
                    break;
            }
        }
    }

    public static void createTeam(Scanner input, ArrayList<Teams> teams) {
        System.out.println("Input team name: ");
        String teamName = input.next();
        System.out.println("Input team members: ");
        int teamMembers = input.nextInt();
        Teams ole = new Teams(teamName, teamMembers);
        teams.add(ole);
        System.out.println("You're new team: " + ole);
    }

    public static void addPointsToTeam(Scanner input, ArrayList<Teams> teams) {
        System.out.println("Input the name of the team you want to add points to: ");
        String team = input.next();
        System.out.println("Assign the total value of points: ");
        int points = input.nextInt();
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getTeamName().equalsIgnoreCase(team)) {
                teams.get(i).setPoints(points);
                System.out.println("Added points to: " + teams.get(i));
            }
        }
    }

    public static void addGoalsToTeam(Scanner input, ArrayList<Teams> teams) {
        System.out.println("Input the name of the team you want to add goals to: ");
        String team = input.next();
        System.out.println("Assign the total value of goals: ");
        int goals = input.nextInt();
        System.out.println("Assign the total value of negative goals: ");
        int negativeGoals = input.nextInt();
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getTeamName().equalsIgnoreCase(team)) {
                goals = goals - negativeGoals;
                teams.get(i).setNumberOfGoals(goals);
                System.out.println("Added goals to: " + teams.get(i));
            }
        }
    }

    public static void showAllTeams(ArrayList<Teams> teams) {
        for (int i = 0; i < teams.size(); i++) {
            System.out.println(teams.get(i));

        }
    }

    public static void showPlacement(ArrayList<Teams> teams) {
        Collections.sort(teams);

        for (int i = 0; i < teams.size(); i++) {
            Teams team = teams.get(i);
            System.out.println(i + 1 + ": " + team);
        }
    }

    public static void createMatch(Scanner input, ArrayList<Match> matches, ArrayList<Teams> teams) {
        System.out.println("Input first team of match: ");
        String teamName1 = input.next();
        Teams teamOne = null;
        for (Teams t : teams) {
            if (t.getTeamName().equals(teamName1)) {
                teamOne = t;
            }
        }
        System.out.println("Input second team of match: ");
        String teamName2 = input.next();
        Teams teamTwo = null;
        for (Teams t : teams) {
            if (t.getTeamName().equals(teamName2)) {
                teamTwo = t;
            }
        }
        System.out.println("Enter month of match start: ");
        int matchMonth = input.nextInt();
        System.out.println("Enter date of match start: ");
        int matchDate = input.nextInt();
        System.out.println("Enter time of match start: ");
        int matchTime = input.nextInt();
        Match newMatch = new Match(teamOne, teamTwo, matchMonth, matchDate, matchTime);
        matches.add(newMatch);
        System.out.println(newMatch);
    }

    public static void showAllMatches(ArrayList<Match> matches) {
        for (int i = 0; i < matches.size(); i++) {
            System.out.println(matches.get(i));

        }
    }

    public static void createTournament(Scanner input, ArrayList<Tournament> tournaments) {
        System.out.println("Type tournament name");
        String tournamentName = input.next();
        System.out.println("Type in the date of the tournament");
        String date = input.next();
        System.out.println("Type in the start time of the tournament");
        int startTime = input.nextInt();
        System.out.println("Type in the end time of the tournament");
        int endTime = input.nextInt();
        Tournament tournament1 = new Tournament(startTime, endTime, date, tournamentName);
        tournaments.add(tournament1);
    }

    public static void addGameToTournament(){

    }

    public static void showTournaments(ArrayList<Tournament> tournaments) {
        for (int i = 0; i < tournaments.size(); i++) {
            System.out.println(tournaments.get(i));
        }
    }
}
