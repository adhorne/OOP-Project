/**
 * Create a driver class that will demonstrate that any class that implements the MultimediaControl
 * Interface would be able to be instantiated and use its methods used no matter if it was an audio
 * or movie player.
 *
 * @author Austin Horne
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaCollectionDemo {

  private static void print(List<Product> list) {
    for (Product p : list) {
      System.out.println(p + "\n");
    }
  }

  public static void main(String[] args) {
    ArrayList<Product> list = new ArrayList<Product>();

    list.add(new AudioPlayer("Product 1", "Specification 1", ItemType.AUDIO));
    list.add(new MoviePlayer("My movie player 1"));

    list.add(new AudioPlayer("Product 2", "Specification 2", ItemType.AUDIO));
    list.add(new MoviePlayer("My movie player 2"));

    list.add(new AudioPlayer("Product 3", "Specification 3", ItemType.AUDIO));
    list.add(new MoviePlayer("My movie player 3"));

    Collections.sort(list);

    print(list);
  }
}
