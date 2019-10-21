package Models;

import java.util.ArrayList;

public class DropDown {
  private ArrayList<String> dropdown = new ArrayList<String>();

  public ArrayList getDropdown() {
    return dropdown;
  }

  public void setDropdown(ArrayList dropdown) {
    this.dropdown = dropdown;
  }

  public ArrayList<String> populateDropdown(){
    dropdown.add("[1] DKK   DROPDOWN");
    dropdown.add("[2] PLN");
    dropdown.add("[3] USD");
    dropdown.add("[4] GBP");
    dropdown.add("[5] RUB");
    dropdown.add("[6] ISK");

    return dropdown;
  }



}
