package Models;

public class Currency {
  private double amount;
  //private double rate;
  private String currencyType;

  public Currency (double a, double r, String ct){
    this.amount=a;
//    this.rate=r;
    this.currencyType=ct;
  }


  public double getAmount(){
    return amount;
  }
  public void setAmount(double a){
    this.amount = a;
  }

//  public double getRate(){
//    return rate;
//  }
//  public void setRate(double r){
//    this.rate = r;
//  }

  public String getCurrencyType(){
    return currencyType;
  }
  public void setCurrencyType(String ct){
    this.currencyType = ct;
  }
}
