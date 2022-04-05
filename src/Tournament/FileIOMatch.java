package Tournament;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIOMatch implements FileIO<Match>{
    @Override
    public void saveData(ArrayList<Match> matches) {
        String gameData = "";
        for (Match a : matches) {
            gameData += "Teamone: " + a.getTeamOne() + " teamtwo " + a.getTeamTwo() + " MatchMonth " + a.getMatchMonth() + " MatchDate " + a.getMatchDate() + " MatchTime: " + a.getMatchTime() +"\n";
        }
        try {
            FileWriter output = new FileWriter("src/Tournament/MatchData.txt");
            output.write(gameData);
            output.close();
        }
        catch (IOException e) {
        }
    }


    @Override
    public ArrayList<Match> loadData() {
        File text = new File("src/Tournament/MatchData.txt");
        ArrayList<Match> matches = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(text);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.length()>0) {
                    Scanner lineScanner = new Scanner(line);
                    lineScanner.next();
                    Teams teamOne = null;
                    teamOne = lineScanner.next();
                    lineScanner.next();
                    Teams teamTwo = lineScanner.next();
                    lineScanner.next();
                    int matchMonth = lineScanner.nextInt();
                    lineScanner.next();
                    int matchDate = lineScanner.nextInt();
                    lineScanner.next();
                    int matchTime = lineScanner.nextInt();
                    Match loadedMatch = new Match(teamOne,teamTwo,  matchMonth,  matchDate, matchTime);
                    matches.add(loadedMatch);
                }
            }
        }
        catch (IOException e) {

        }
        return matches;
    }
}
