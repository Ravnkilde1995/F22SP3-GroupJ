package Tournament;

public interface DataIOTournament {
    void saveData();
    void loadData();
    void showAllTeams();
    void getStartTime();
    void setStartTime();
    void getEndTime();
    void setEndTime();
    void getDate();
    void setDate();
    void getTeamName();
    void setTeamName(String teamName);
}
