import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shared {
  private List<Integer> results;

  public Shared() {
  }

  public List<Integer> getResults() {
    return results;
  }

  public void setResults(List<Integer> results) {
    this.results = results;
  }

  public List<Integer> readResults() throws Exception{
    String filename = "numbers.txt";
    List<String> recordsString;
    List<Integer> shared;

    recordsString = readFile(filename);
    shared = toInt(recordsString);

    return shared;
  }


  public static List<String> readFile(String filename) throws Exception{
    String line = null;
    List<String> records = new ArrayList<String>();

    // wrap a BufferedReader around FileReader
    BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

    // use the readLine method of the BufferedReader to read one line at a time.
    // the readLine method returns null when there is nothing else to read.
    while ((line = bufferedReader.readLine()) != null) {
      records.add(line);
    }

    // close the BufferedReader when we're done
    bufferedReader.close();
    return records;
  }

  public static List<Integer> toInt(List<String> listString){
    List<Integer> newList = listString.stream()
        .map(s -> Integer.parseInt(s))
        .collect(Collectors.toList());

    return newList;
  }
}


