import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WindowController {
  Scanner scan = new Scanner(System.in);
  public int mouseInput = scan.nextInt();


  public void showCurrencyWindow(){
    Label label = new Label();
    label.setLabelText("Label: Currency amount");

    InputField inputField = new InputField();
    double amount = scan.nextDouble();
    inputField.setInputAmount(amount);

    DropDown dropDown = new DropDown();
    dropDown.setDropdown(dropDown.populatedDropdown());

    Button button1 = new Button();
    button1.setName("BUTTON: [1] OK");
    button1.setFunction("Counting currency");

    Button button2 = new Button();
    button2.setName("BUTTON: [2] About");
    button2.setFunction("Redirecting to \"About\" window");

    ArrayList<Button> buttons = new ArrayList<>();
    buttons.add(button1);
    buttons.add(button2);

    Window window = new Window();
    window.setLabel(label);
    window.setInputField(inputField);
    window.setDropDown(dropDown);
    window.setButtons(buttons);

    System.out.println(window.getLabel().setLabelText("LABEL: Enter amount to convert:")+"\n"+
        window.getInputField().getInputAmount()+"\n"+
        window.getLabel().setLabelText("LABEL: From:")+"\n"+
        window.getDropDown().getDropdown()+"\n"+//-----------------------------------for:each
        int choice = mouseInput +
        scan.nextInt();+
        window.getLabel().setLabelText("LABEL: To:")+"\n"+
        //window.getDropDown().getDropdown()
    );
    for(Button button:window.getButtons()){
      System.out.println(button.getName());
    }
  }

}
