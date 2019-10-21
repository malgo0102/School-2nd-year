//Algorithm code from https://www.tutorialspoint.com/java-program-to-implement-bubble-sort

public class BubbleSortStrategy extends SortingStrategy{
  private int[] arr;
  private int n;

  public BubbleSortStrategy(int[] array, int n){
    this.arr = array;
    this.n = n;
  }

  @Override
  public void sort(int[] arr, int n) {
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
      System.out.print(arr[k]+" ");
    }
    System.out.println(" sorted with Bubble Sort strategy");
  }
}

