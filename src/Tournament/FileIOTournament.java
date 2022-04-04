package Tournament;

public abstract class FileIOTournament implements DataIOTournament{

    int totalRanking;

    public FileIOTournament (int totalRankings) {
        this.totalRanking = totalRankings;
    }

    @Override
    public void saveData() {

    }

    @Override
    public void loadData() {

    }

    @Override
    public void showAllTeams() {

    }

    @Override
    public void getStartTime() {

    }

    @Override
    public void setStartTime() {

    }

    @Override
    public void getEndTime() {

    }

    @Override
    public void setEndTime() {

    }

    @Override
    public void getDate() {

    }

    @Override
    public void setDate() {

    }

    public void totalRanking() {

    }

    public void getTotalRanking() {

    }

    public void setTotalRanking(int totalRanking) {
        this.totalRanking = totalRanking;
    }
}
