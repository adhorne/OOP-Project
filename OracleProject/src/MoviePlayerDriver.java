/**
 * A diver class to test the functionality of the movie player
 *
 * @author Austin Horne
 */

public class MoviePlayerDriver {

  public static void testMoviePlayer() {
    MoviePlayer mp = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LCD);
    System.out.println(mp.toString());
    MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK",
        new Screen("1366x768", 40, 22), MonitorType.LED);
    System.out.println(mp2.toString());
  }
}
