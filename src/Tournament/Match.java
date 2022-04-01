package Tournament;

public class Match {

    //Fields
    // ******************
    private String matchTitel;
    private double matchStart;
    private  double matchEnd;


    //Constructor
    //******************
    public Match(String matchTitel, double matchStart, double matchEnd){
        this.matchTitel=matchTitel;
        this.matchStart=matchStart;
        this.matchEnd=matchEnd;


    }

    //Methods
    //******************
    public String getMatchTitel(){
        return matchTitel;
    }

    public void setMatchTitel(String matchTitel){

    }
}
