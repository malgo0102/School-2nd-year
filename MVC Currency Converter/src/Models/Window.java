package Models;

import Models.Button;
import Models.Label;

import java.util.ArrayList;

public class Window {
  private ArrayList<Label> labels;
  private InputField inputField;
  private ArrayList<DropDown> dropDown;
  private ArrayList<Button> buttons;

  //Constructor
  public Window(){};

  //Getters and setters
  public InputField getInputField() {
    return inputField;
  }

  public void setInputField(InputField inputField) {
    this.inputField = inputField;
  }

  public ArrayList<Label> getLabels() { return labels; }

  public void setLabels(ArrayList<Label> labels) { this.labels = labels; }

  public ArrayList<DropDown> getDropDown() { return dropDown; }

  public void setDropDown(ArrayList<DropDown> dropDown) { this.dropDown = dropDown; }

  public ArrayList<Button> getButtons() {
    return buttons;
  }

  public void setButtons(ArrayList<Button> buttons) {
    this.buttons = buttons;
  }

}
