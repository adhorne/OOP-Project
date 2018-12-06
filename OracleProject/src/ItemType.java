/**
 * Create an enum called ItemType that will store the following information
 *
 * @author Austin Horne
 */

public enum ItemType {

  AUDIO("AU"), VISUAL("VI"), AUIDO_MOBLIE("AM"), VISUAL_MOBLIE("VM");

  private final String code;

  ItemType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

}
