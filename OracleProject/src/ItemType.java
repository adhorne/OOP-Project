/* Create an enum called ItemType that will
    store the following information */
public enum ItemType {

  AUDIO("AU"), VISUAL("VI"), AUIDOMOBLIE ("AM"), VISUALMOBLIE("VM");
    
    public String code;
    
    ItemType(String code) {
        this.code = code;
    }

}
