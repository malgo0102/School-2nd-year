package Controllers;

import Models.About;

public class AboutController {

  // Display "Models.About"
  public String viewAbout(){
    About about = new About();
    return about.getAbout();
  }
  public void showAboutWindow(){

  }
}
