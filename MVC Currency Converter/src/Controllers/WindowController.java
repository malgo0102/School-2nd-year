package Controllers;

import Models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class WindowController implements Actionable {
  Scanner scan = new Scanner(System.in);
  private int mouseInput = scan.nextInt();



  public void showCurrencyWindow(){
    // Labels
    Label label1 = new Label();
    label1.setLabelText("LABEL: Enter amount to convert:");

    Label label2 = new Label();
    label2.setLabelText("LABEL: From:");

    Label label3 = new Label();
    label3.setLabelText("LABEL: To:");

//    Label label4 = new Label();
//    label4.setLabelText("LABEL: ");
//
//    Label label5 = new Label();
//    label5.setLabelText("LABEL: ");

    ArrayList<Label> labels = new ArrayList<>();
    labels.add(label1);
    labels.add(label2);
    labels.add(label3);

    // Input amount
    InputField inputField = new InputField();
    double amount = scan.nextDouble();
    inputField.setInputAmount(amount);

    // Dropdowns
    DropDown dropDown1 = new DropDown();
    dropDown1.setDropdown(dropDown1.populateDropdown());

    DropDown dropDown2 = new DropDown();
    dropDown2.setDropdown(dropDown2.populateDropdown());

    ArrayList<DropDown> dropDowns = new ArrayList<>();
    dropDowns.add(dropDown1);
    dropDowns.add(dropDown2);

    // Buttons
    Button button1 = new Button();
    button1.setName("BUTTON: [1] OK");
    button1.setFunction("Counting currency");

    Button button2 = new Button();
    button2.setName("BUTTON: [2] Models.About");
    button2.setFunction("Redirecting to \"Models.About\" window");

    ArrayList<Button> buttons = new ArrayList<>();
    buttons.add(button1);
    buttons.add(button2);

    Window window = new Window();
    window.setLabels(labels);
    window.setInputField(inputField);
    window.setDropDown(dropDowns);
    window.setButtons(buttons);

    for(Label label:window.getLabels()){
      System.out.println(label.getLabelText());
    }
    System.out.println(window.getInputField());
    for(DropDown dropDown:window.getDropDown()){
      System.out.println(dropDown.getDropdown());
    }
    for(Button button:window.getButtons()){
      System.out.println(button.getName());
    }
  }

  @Override
  public void Action(String target, String action) {
    if (target.equals("clickOK"))
    {

    }
    else if (target.equals("clickCancel"))
    {

    }
    else if (target.equals("clickAbout"))
    {

    }
  }

}
