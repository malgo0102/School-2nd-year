import java.util.ArrayList;

public class Window {
  private InputField inputField;
  private Label label;
  private DropDown dropDown;
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

  public Label getLabel() {
    return label;
  }

  public void setLabel(Label label) {
    this.label = label;
  }

  public DropDown getDropDown() {
    return dropDown;
  }

  public void setDropDown(DropDown dropDown) {
    this.dropDown = dropDown;
  }

  public ArrayList<Button> getButtons() {
    return buttons;
  }

  public void setButtons(ArrayList<Button> buttons) {
    this.buttons = buttons;
  }


}
