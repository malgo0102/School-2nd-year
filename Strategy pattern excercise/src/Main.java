import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    long startTime;
    long endTime;
    long timeElapsed;

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the amount of numbers to sort:");
    int n = scan.nextInt();
    System.out.println("Enter max range value:");
    int m = scan.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i <n; i++){
      int random = (int )(Math.random() * m + 1);
      arr[i] = random;
    }

//    public void sort(SortingStrategy sortingStrategy){
//      sortingStrategy.sort(arr,n);
//    }
    startTime = System.nanoTime();
    SortingStrategy quickSortStrategy = new QuickSortStrategy(arr,n);
    quickSortStrategy.sort(arr,n);
    endTime = System.nanoTime();
    timeElapsed = endTime - startTime;
    System.out.println("Execution time in nanoseconds : " +
        timeElapsed);
    System.out.println();

    startTime = System.nanoTime();
    SortingStrategy selectionSortStrategy = new SelectionSortStrategy(arr,n);
    selectionSortStrategy.sort(arr,n);
    endTime = System.nanoTime();
    timeElapsed = endTime - startTime;
    System.out.println("Execution time in nanoseconds : " +
        timeElapsed);
    System.out.println();

    startTime = System.nanoTime();
    SortingStrategy bubbleSortStrategy = new BubbleSortStrategy(arr,n);
    bubbleSortStrategy.sort(arr,n);
    endTime = System.nanoTime();
    timeElapsed = endTime - startTime;
    System.out.println("Execution time in nanoseconds : " +
        timeElapsed);
    System.out.println();

    startTime = System.nanoTime();
    SortingStrategy mergeSortStrategy = new MergeSortStrategy(arr,n);
    mergeSortStrategy.sort(arr,n);
    endTime = System.nanoTime();
    timeElapsed = endTime - startTime;
    System.out.println("Execution time in nanoseconds : " +
        timeElapsed);
    System.out.println();



//    myArray.sort(new QuickSortStrategy(myArray.getArrayToSort()));
//    myArray.sort(new SelectionSortStrategy(myArray.getArrayToSort()));
  }

}
