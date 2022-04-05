package Tournament;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Teams> teams = new ArrayList<>();
        ArrayList<Match> matches = new ArrayList<>();
        ArrayList<Tournament> tournaments = new ArrayList<>();

        FileIOTournament tournamentIO = new FileIOTournament();

        FileIOTeams teamsIO = new FileIOTeams();
        teams=teamsIO.loadData();
        tournaments=tournamentIO.loadData();

        //FileIOMatch.loadData(teams, tournaments);
        Menu.mainMenu(input, teams, matches, tournaments);

        teamsIO.saveData(teams);
        tournamentIO.saveData(tournaments);

       // FileIOTournament.saveGameData(teams, tournaments);

    }

}
