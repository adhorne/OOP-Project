/**
 * A diver class to test the functionality of the audio player
 *
 * @author Austin Horne
 */

public class AudioPlayerDriver {

  public static void testAudioPlayer() {
    AudioPlayer ap = new AudioPlayer("iPod Mini", "MP3");
    ap.play();
    ap.stop();
    ap.next();
    ap.previous();
    System.out.println(ap.toString());
    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(ap2.toString());
  }
}
