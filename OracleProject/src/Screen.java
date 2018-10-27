/**
 * Create a class called Screen that implements ScreenSpec. Add three fields
 *
 * @author Austin Horne
 */

public class Screen implements ScreenSpec {

  private String resolution;
  private int refreshrate;
  private int responsetime;

  // Complete the methods from the ScreenSpec interface.
  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }

  public String getResolution() {
    return resolution;
  }

  public int getRefreshRate() {
    return refreshrate;
  }

  public int getResponseTime() {
    return responsetime;
  }

  // Add a toString method that will return the details of the 3 field
  // in the same format as the Product Class.
  public String toString() {
    return "Resolution: " + resolution + "\n" +
        "Refresh Rate: " + refreshrate + "\n" +
        "Response Time: " + responsetime;
  }
}
