/**
 * The program is required to create an audit trail on its tests of the production line so that it
 * records which employee ran the test. To accomplish this you will need to create a class named
 * EmployeeInfo that will allow the user to input their full name and then create a user id
 * of their first initial and surname.
 *
 * @author Austin Horne
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

  // Class Constructor
  public EmployeeInfo() {
    in = new Scanner(System.in);
    setDeptId();
    setName();
    in.close();
  }

  //following methods defined
  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  // Call to inputName to get input from user
  private void setName() {
    this.name = new StringBuilder(inputName());
  }


  private void createEmployeeCode(StringBuilder name) {
    int indexOfSpace = name.indexOf(" ");
    String lastName = name.substring((indexOfSpace + 1), name.length());
    this.code = name.charAt(0) + lastName;
  }

  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    StringBuilder input = new StringBuilder(in.nextLine());
    boolean hasSpace = checkName(input);
    if (hasSpace) {
      createEmployeeCode(input);
    } else {
      this.code = "guest";
    }
    return input.toString();
  }

  private boolean checkName(StringBuilder name) {
    return name.toString().contains(" ");
  }

  public String getDeptId() {
    System.out.println("Please enter the department ID: ");
    String input = in.nextLine();
    if (validId(input)) {
      return input;
    }
    return "None01";
  }

  private void setDeptId() {
    this.deptId = getDeptId();
  }

  public String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    Matcher m = p.matcher(id);
    return m.matches();
  }

  public String reverseString(String id) {
    StringBuilder s = new StringBuilder(id);
    s = s.reverse();
    return s.toString();
  }

  public String toString() {
    return "Employee code: " + code + "\nDepartment Number: " + deptId;
  }

}
