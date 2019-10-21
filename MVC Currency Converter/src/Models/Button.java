package Models;

public class Button {
  private String name;
  private String function;

  //constructor
//  public Models.Button(String name, String function) {
//    this.name = name;
//    this.function = function;
//  }
  // Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFunction() {
    return function;
  }

  public void setFunction(String function) {
    this.function = function;
  }

  public void click()
  {
    System.out.println("Click: " + name + "executing " + function);
  }


}
