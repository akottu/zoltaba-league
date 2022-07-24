import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Player> players = new ArrayList<>();

        addPlayers(players);


        runArchive();

    }

    private static void addPlayers(List<Player> players) {
        players.add(new Player("Anish Kottu", 1));
        players.add(new Player("Alex Frumkin", 1));
        players.add(new Player("Mihir Dutta", 1));
        players.add(new Player("Jeremy Cohen", 1));
        players.add(new Player("Dylan Zumar", 1));
        players.add(new Player("Toma Shigaki-Than", 1));
        players.add(new Player("Hunter Kaufman", 1));
        players.add(new Player("Sam Auld", 1));
        players.add(new Player("Albert Wheeler", 1));
        players.add(new Player("Michael Zheng", 1));
        players.add(new Player("Jule Cuasay", 1));
        players.add(new Player("Sahith Reddy", 1));
        players.add(new Player("Brody Trujillo", 1));
        players.add(new Player("Surya Tumbapura", 1));
        players.add(new Player("Darien Heath", 1));
        players.add(new Player("Michael Williams", 1));
        players.add(new Player("Chris Yang", 1));
        players.add(new Player("TJ Sadler", 1));
        players.add(new Player("Jacob Schuknecht", 1));
        players.add(new Player("Kody Olthof", 1));
        players.add(new Player("Alex Halsey", 1));
        players.add(new Player("Jake Clorfene", 1));
        players.add(new Player("Player 23", 1));
        players.add(new Player("Player 24", 1));
    }

    public static void runArchive() throws InterruptedException {
        League zdfb = new League("Zoltaba Dynasty Fantasy Basketball");
        zdfb.getSeasons().add(new Season("ZDFB2022"));

        zdfb.getSeason("ZDFB2022").setDivisions();
        zdfb.getSeason("ZDFB2022").displayDivisions();
        zdfb.getSeason("ZDFB2022").setDraftOrder();
        zdfb.getSeason("ZDFB2022").displayDraftOrder();
    }
}