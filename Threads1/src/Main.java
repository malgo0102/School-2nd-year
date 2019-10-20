//Exercise:
//    Make a Java program that can create and start an arbitrary number of threads, each
//    given a name (use the documentation). The thread should print out its name when
//    started. Try different combinations of how objects are instantiated and started { what
//    influence does that have?

import java.util.Scanner;

public class Main {
  public static void main (String [] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("How many threads should be created?");
    int no = sc.nextInt();
    sc.nextLine();
    System.out.println(no+" threads will be created. Name them:");
    String name = "";
    for (int i =0; i<no; i++){

//      String name = sc.nextLine();

      name = name + "*";
      System.out.println((i+1)+": "+name);

      Namer n = new Namer(name);
      Thread t = new Thread(n);

      t.setName(name);
      t.start();

    }
    System.out.println("Finished.");
  }
}

