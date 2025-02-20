import java.util.Random;

class RandomPlayer {
    public void playGame(String gameName) throws InterruptedException {
        System.out.println(gameName + " game started");
        Thread.sleep(1000);
        System.out.println(gameName + " game ended");
    }

    public void playMusic(String trackName) throws Exception {
        System.out.println(trackName + " track playing");
        Thread.sleep(1000);
        System.out.println(trackName + " track ended");
    }
}

public class TestThread {
    static String[] games = { "COD", "Prince of Persia", "GTA 5", "Valorant", "FIFA 22", "Fortnite" };
    static String[] tracks = { "Believer", "Cradles", "Taki-Taki", "Sorry", "Let me find you" };

    public static void main(String[] args) {
        RandomPlayer player = new RandomPlayer();
        Random random = new Random();

        Runnable gameRunner = () -> {
            try {
                player.playGame(games[random.nextInt(games.length)]);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        };

        Runnable musicPlayer = () -> {
            try {
                player.playMusic(tracks[random.nextInt(tracks.length)]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };

        Thread game = new Thread(gameRunner);
        Thread music = new Thread(musicPlayer);

        game.start();
        music.start();
    }
}
