package Models;

import Controllers.Actionable;

public class Button implements Actionable {
  private String name;

//  constructor
  public Models.Button(String name) {
    this.name = name;
  }
  // Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void click(String name, String action)
  {
    System.out.println("Click: " + name + "executing " + action);
  }


}
