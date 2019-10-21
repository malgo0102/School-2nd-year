// findExchangeRateAndConvert() from https://www.javatips.net/blog/java-currency-conversion-example
package Controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CurrencyController {
  private static Double findExchangeRateAndConvert(String from, String to, int amount) {
    try {
      //Yahoo Finance API
      URL url = new URL("http://finance.yahoo.com/d/quotes.csv?f=l1&s="+ from + to + "=X");
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      String line = reader.readLine();
      if (line.length() > 0) {
        return Double.parseDouble(line) * amount;
      }
      reader.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
}
