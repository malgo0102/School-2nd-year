//Algorithm code from https://www.tutorialspoint.com/java-program-to-implement-bubble-sort

public class BubbleSortStrategy implements SortingStrategy{
  private int[] arr;

  //Constructor
  public BubbleSortStrategy(int[] array){
    this.arr = array;
  }

  @Override
  public void sort(int[] arr) {
    int n = arr.length;
    int number = 0;
    for(int i = 0; i < n; i++) {
      for(int j=1; j < (n-i); j++) {
        if(arr[j-1] > arr[j]) {
          number = arr[j-1];
          arr[j-1] = arr[j];
          arr[j] = number;
        }
      }
    }
    for(int k=0; k<n; k++){
      System.out.print(arr[k]);
    }
    System.out.println(" sorted with Bubble Sort strategy");
  }
}

