public class MilitaryDictator extends Leader implements PowerActions{
    protected String militaryRank;
    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank){
        super(name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }
    @Override
    public void implementPolicy(String policy){
        if(policy == "stupid"){
            System.out.println("He invents a stupid inator so people will vote for him");
        }
        else{
        System.out.println("Invents a some-kind-of-inator");
        }
    }
    @Override
    public void repressOpposition(){
        System.out.println("makes a repress-opposition-inator");
    }
    @Override
    public void holdParade(){
        System.out.println("He uses his hold-parade-inator to hold parades");
    }
    @Override
    public String giveSpeech(){
        return "I will invent a new inator that will make life good";
    }
    public String getMilitaryRank(){
        return militaryRank;
    }
}
