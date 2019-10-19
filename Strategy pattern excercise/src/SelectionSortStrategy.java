// Algorithm code from http://www.java2novice.com/java-sorting-algorithms/selection-sort/

public class SelectionSortStrategy implements SortingStrategy{
  private int[] arr;

  public SelectionSortStrategy(int[] array){
    this.arr = array;
  }

  @Override
  public void sort(int[] arr){

    for (int i = 0; i < arr.length - 1; i++)
    {
      int index = i;
      for (int j = i + 1; j < arr.length; j++)
        if (arr[j] < arr[index])
          index = j;

      int smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
    for(int k=0; k<arr.length; k++){
      System.out.print(arr[k]);
    }
    System.out.println(" sorted with Selection Sort strategy");
  }
}
