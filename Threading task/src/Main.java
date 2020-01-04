import java.util.List;

public class Main {
  public static void main(String[] args)throws Exception{
    Shared shared = new Shared();
    List<Integer> results = shared.readResults();
    shared.setResults(results);

    //thread 1
//    read 1st number, pass it to t2
//    read 3rd number, add it to sum from t2 and so on
    Adder adder1 = new Adder(shared);
    Thread t1 = new Thread(adder1);

    //thread 2
//    read t1 number, add to 2nd number and so on
    Adder adder2 = new Adder(shared);
    Thread t2 = new Thread(adder2);

    // print multi-threaded result


    //add the numbers
    int sum = 0;
    for(int i = 0; i<shared.getResults().size(); i++){
      sum = sum + shared.getResults().get(i);
      System.out.println(shared.getResults().get(i));
    }

    //Print single threaded result
    System.out.println("Single threaded sum = "+sum);
  }

}
