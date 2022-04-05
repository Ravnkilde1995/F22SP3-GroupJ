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

        Menu.mainMenu(input, teams, matches, tournaments);

        FileIOTeams.saveGameData(teams);
        FileIOTeams.loadGameData(teams);

        FileIOTournament.saveGameData(teams, tournaments);
        FileIOTournament.loadGameData(teams, tournaments);
    }



}
