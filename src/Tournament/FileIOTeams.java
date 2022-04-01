package Tournament;

public class FileIOTeams implements DataIOTeams {
    //Fields
    // ******************
    private int numberOfGoals;
    private int points;


    //Constructor
    //******************
    public FileIOTeams(int numberOfGoals, int points) {
    this.numberOfGoals=numberOfGoals;
    this.points=points;
    }


    //methods
    //******************
    @Override
    public void saveData() {

    }

    @Override
    public void loadData() {

    }

    @Override
    public String getTeamName() {
        return null;
    }

    @Override
    public void setTeamName(String teamName) {

    }

    public int getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}


