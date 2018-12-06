/**
 * Create a class called MoviePlayer that extends Product and implements MultimediaControl.
 *
 * @author Austin Horne
 */

public class MoviePlayer extends Product implements MultimediaControl {

  // Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
  private Screen screen;
  private MonitorType monitorType;

  // Complete the methods from the MultimediaControl interface in a similar
  // fashion to the audio player.

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  public void play() {
    System.out.println("Playing Movie");
  }

  public void stop() {
    System.out.println("Stopping Movie");
  }

  public void previous() {
    System.out.println("Previous Movie");
  }

  public void next() {
    System.out.println("Next Movie");
  }

  // Create a toString method that calls the product toString, displays the
  // monitor and the screen details.
  public String toString() {
    return super.toString() + "\n" +
        screen.toString() + "\n" +
        "Monitor Type:" + monitorType;
  }
}
