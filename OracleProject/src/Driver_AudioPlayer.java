/**
 * Create a driver class for AudioPlayer that will test to see whether we can instantiate
 * occurrences of it, use the media controls and print out their details to the console
 *
 * @author Austin Horne
 */

public class Driver_AudioPlayer {

  public static void main(String args[]) {
    AudioPlayer audioPlayer = new AudioPlayer("Product",
        "Specification", ItemType.AUDIO);

    System.out.println(audioPlayer);
  }
}
