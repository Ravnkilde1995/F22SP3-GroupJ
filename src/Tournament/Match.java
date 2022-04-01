package Tournament;

public class Match {

    //Fields
    // ******************
    private String matchTitle;
    private double matchStart;
    private double matchEnd;


    //Constructor
    //******************
    public Match(String matchTitle, double matchStart, double matchEnd){
        this.matchTitle=matchTitle;
        this.matchStart=matchStart;
        this.matchEnd=matchEnd;


    }

    //Methods
    //******************
    public String getMatchTitle(){
        return matchTitle;
    }

    public void setMatchTitle(String matchTitle){
        this.matchTitle=matchTitle;
    }

    public double getMatchStart() {
        return matchStart;
    }

    public void setMatchStart(double matchStart) {
        this.matchStart = matchStart;
    }

    public double getMatchEnd() {
        return matchEnd;
    }

    public void setMatchEnd(double matchEnd) {
        this.matchEnd = matchEnd;
    }
}
