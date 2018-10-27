/**
 * We require a concrete class that will allow us to capture the details of an audio player. Create
 * a class called AudioPlayer that is a subclass of Product and implements the MultimediaControl
 * interface.
 *
 * @author Austin Horne
 */

public class AudioPlayer extends Product implements MultimediaControl, Comparable<Item> {

  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer(String name, String audioSpecification, ItemType mediaType) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  public void play() {
    System.out.println("Playing");

  }

  public void stop() {
    System.out.println("Stopping");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  public String toString() {
    return super.toString() + "Audio Specification :" + audioSpecification + '\n' +
        "Media Type :" + mediaType + "\n";
  }

}

