/**
 * Create a class called MoviePlayer that extends Product and implements MultimediaControl.
 *
 * @author Austin Horne
 */

public class MoviePlayer extends Product implements MultimediaControl, Comparable<Item> {

  // Add 2 fields to this class called screen and monitor type and assign appropriate types to them.
  private Screen screen;
  private MonitorType monitorType;

  // Complete the methods from the MultimediaControl interface in a similar
  // fashion to the audio player.

  public MoviePlayer(String name) {
    super(name);
    screen = new Screen("1024x768", 60, 10);
    monitorType = MonitorType.LCD;
  }

  public MoviePlayer(String name, Screen screen, MonitorType type) {
    super(name);
    this.screen = screen;
    this.monitorType = type;
  }

  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stopped");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  // Create a toString method that calls the product toString, displays the
  // monitor and the screen details.
  public String toString() {
    return super.toString() + "\n" +
        screen.toString() + "\n" +
        "Monitor Type:" + monitorType;
  }
}
