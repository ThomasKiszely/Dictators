import java.util.ArrayList;
//Vi har prøvet at få så meget som muligt ud i metoder og klasser, ligesom i Dance og StarWars-opgaverne
public class Main {
    public static void main(String[] args) {
        ArrayList<Leader> leaders = DictatorManager.initializeLeaders();
        displayLeaders(leaders);
    }
    private static void displayLeaders(ArrayList<Leader> leaders) {
        for (Leader leader : leaders) {
            System.out.println();
            leader.printDetails();
            String speech = leader.giveSpeech();
            System.out.println(speech);
            System.out.println("-he says");
            if (leader instanceof PoliticalDictator) {
                String party = ((PoliticalDictator) leader).showPartyName();
                System.out.println("He is the head of " + party);
                ((PoliticalDictator) leader).holdParade();
                ((PoliticalDictator) leader).repressOpposition();
                ((PoliticalDictator) leader).implementPolicy("save");
                System.out.println();
            }
            if (leader instanceof MilitaryDictator) {
                String rank = ((MilitaryDictator) leader).getMilitaryRank();
                System.out.println("He thinks he's a " + rank + " but actually he's not...");
                ((MilitaryDictator) leader).holdParade();
                System.out.print("To oppress the opposistion he ");
                ((MilitaryDictator) leader).repressOpposition();
                ((MilitaryDictator) leader).implementPolicy("stupid");
                System.out.println();
            }

        }
    }
}
