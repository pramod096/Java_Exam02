
/**
 *
 * @author Pramod Reddy Gonegari
 */
public class Cricket extends Game {

    int numberOfPlayers;

    public Cricket(String gameName, int numberOfPlayers) {
        super(gameName);
        this.numberOfPlayers = numberOfPlayers;
    }

    public void cricketMatch() {
        System.out.println("IPL starts April 9th");
    }

    @Override
    public void gameDay() {
        System.out.println("The Game is " + getGameName());
    }

}
