/**
 * The audio players and the movie players share the same control interface on the physical devices.
 * The control interface does not care if the device is a video player or an audio player.
 * Create a driver class that will demonstrate that any class that implements the MultimediaControl
 * Interface would be able to be instantiated and use its methods used no matter if
 * it was an audio or movie player.
 *
 * @author Austin Horne
 */

public class PlayerDriver {

  public static void testPlayer() {

    MultimediaControl mp = new MoviePlayer("DBPOWER MK101",
        new Screen("720x480", 40, 22), MonitorType.LED);
    MultimediaControl ap = new AudioPlayer("Audio Name", "Spec");
    ap.next();
    ap.play();
    ap.previous();
    ap.stop();

    mp.next();
    mp.play();
    mp.previous();
    mp.stop();
  }
}
