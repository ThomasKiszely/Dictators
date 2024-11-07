import java.util.ArrayList;
public class DictatorManager {
    private ArrayList<Leader> leaders;
    public DictatorManager(ArrayList<Leader> leaders){
        this.leaders = leaders;
    }
    protected static ArrayList<Leader> initializeLeaders(){
        ArrayList<Leader> leaders = new ArrayList<>();
        leaders.add (new MilitaryDictator("Heinz Doofensmirtz", "Triangle Area", 7,"Doctor"));
        leaders.add (new PoliticalDictator("Scrooge McDuck", "DuckTown", 50, "Anaheim Ducks"));
        return leaders;
    }

}
