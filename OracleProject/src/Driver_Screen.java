/**
 * Create a Driver class for Screen that tests the functionality of the screen class.
 *
 * @author Austin Horne
 */

public class Driver_Screen {

  public static void main(String args[]) {
    Screen scr = new Screen("1024x768", 60, 10);
    System.out.println(scr);
  }
}
