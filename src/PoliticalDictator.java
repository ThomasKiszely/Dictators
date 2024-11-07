public class PoliticalDictator extends Leader implements PowerActions{
    protected String partyName;
    public PoliticalDictator(String name, String country, int yearsInPower, String partyName){
        super(name, country, yearsInPower);
        this.partyName = partyName;
    }
    @Override
    public void implementPolicy(String policy){
        if (policy.equals("strict")) {
            System.out.println("He pretends to let the people decide");
        }
        else if(policy.equals("save")){
            System.out.println("His policy is to save on EVERYTHING");
        }
        else{
            System.out.println();
        }
    }
    @Override
    public void repressOpposition(){
        System.out.println("How he stays on top??? He Just buys everybody");
    }
    @Override
    public void holdParade(){
        System.out.println("He doesn't hold parades. Instead he stays home becuase it's cheaper");
    }
    @Override
    public String giveSpeech(){
        String speech = "I am the richest duck in the world";
        return speech;
    }
    public String showPartyName(){
        return partyName;
    }
}
