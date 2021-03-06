/**
 * Create an abstract type called Product that will implement the Item interface
 *
 * @author Austin Horne
 */

import java.util.Date;

public class Product implements Item, Comparable<Product> {

  // fields to Product
  private int serialNumber;
  private String manufacturer = Item.manufacturer;
  private Date manufacturedOn;
  private String name;
  // integer class variable called currentProductionNumber
  static Integer currentProductionNumber = 1;

  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date(System.currentTimeMillis());
  }

  public String toString() {
    return "Manufacturer : " + manufacturer + "\n" +
        "Serial Number : " + serialNumber + "\n" +
        "Date : " + manufacturedOn + "\n" +
        "Name : " + name + "\n";
  }

  public void setProductionNumber(int productionNumber) {
    currentProductionNumber = productionNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public int compareTo(Product p) {

    return name.compareTo(p.getName());

  }

}

