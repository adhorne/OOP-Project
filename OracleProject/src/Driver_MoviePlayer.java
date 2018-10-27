/**
 * Create a diver class to test the functionality of the movie player.
 *
 * @author Austin Horne
 */

public class Driver_MoviePlayer {

  public static void main(String[] args) {
    MoviePlayer player = new MoviePlayer("My movie player");
    System.out.println("Created a movie player and calling methods.");
    System.out.println(player);
    player.play();
    player.previous();
    player.next();
    player.stop();
  }
}
