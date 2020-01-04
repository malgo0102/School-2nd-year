package Models;

import java.util.LinkedHashMap;
import java.util.Map;

public class CurrencyConverter {
  private Map<String, Double> exchangeRates;

  public CurrencyConverter (Map<String, Double> eR){
    this.exchangeRates=eR;
  }

  public CurrencyConverter() {
    exchangeRates = new LinkedHashMap<>();
    exchangeRates.put("DKK", 1.0);
    exchangeRates.put("PLN", 0.57);
    exchangeRates.put("XAG", 0.0087);
  }

  public Map<String, Double> getExchangeRates() {
    return exchangeRates;
  }

  public void setExchangeRates(Map<String, Double> exchangeRates) {
    this.exchangeRates = exchangeRates;
  }

  public double getRate(String currency) {
    double val = (double)exchangeRates.get(currency);
    return val;
  }



}
