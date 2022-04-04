package Tournament;

public class Match {

    //Fields
    // **

    private Teams teamTwo;
    private Teams teamOne;
    private int matchDate;
    private int matchTime;
    private int matchMonth;


    //Constructor
    //**
    public Match(Teams teamOne, Teams teamTwo, int matchMonth, int matchDate, int matchTime){
        this.matchDate =matchDate;
        this.matchTime =matchTime;
        this.matchMonth = matchMonth;
        this.teamOne=teamOne;
        this.teamTwo=teamTwo;

    }

    //Methods
    //**


    public Teams getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(Teams teamTwo) {
        this.teamTwo = teamTwo;
    }

    public Teams getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(Teams teamOne) {
        this.teamOne = teamOne;
    }

    public int getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(int matchDate) {
        this.matchDate = matchDate;
    }

    public int getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(int matchTime) {
        this.matchTime = matchTime;
    }

    public int getMatchMonth() {
        return matchMonth;
    }

    public void setMatchMonth(int matchMonth) {
        this.matchMonth = matchMonth;
    }

    @Override
    public String toString() {
        String timeformated = "";
        if(matchTime <= 12) {
            timeformated=matchTime+" am";
        }
        else {
            timeformated=matchTime-12+ " pm";
        }
        return "\"" +teamOne+"\"" + " vs " + "\""+teamTwo+"\"" + "" +
                " is scheduled for: " +"\n" + matchMonth + "/" +matchDate + " at " +timeformated + ".";
    }
}