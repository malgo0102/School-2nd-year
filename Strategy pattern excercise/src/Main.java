import java.util.Scanner;

public class Main {
  public static void main(String[] args){

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

    SortingStrategy quickSortStrategy = new QuickSortStrategy(arr,n);
    quickSortStrategy.sort(arr,n);

    SortingStrategy selectionSortStrategy = new SelectionSortStrategy(arr,n);
    selectionSortStrategy.sort(arr,n);

    SortingStrategy bubbleSortStrategy = new BubbleSortStrategy(arr,n);
    bubbleSortStrategy.sort(arr,n);

    SortingStrategy mergeSortStrategy = new MergeSortStrategy(arr,n);
    bubbleSortStrategy.sort(arr,n);



//    myArray.sort(new QuickSortStrategy(myArray.getArrayToSort()));
//    myArray.sort(new SelectionSortStrategy(myArray.getArrayToSort()));
  }

}
