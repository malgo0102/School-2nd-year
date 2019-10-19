//In this assignment, you must do the following:
//    Construct a class with a basic array of numbers (the composition class).
//    The class must be configurable with a strategy for sorting the list (the compositor
//class).
//    Implement at least three dierent sorting algorithms, e.g. QuickSort, MergeSort,
//    BubbleSort etc., that can be used as a strategy.
//    You can easily find implementations of these algorithms (and other sorting algorithms)
//    on the Internet, but you must fit them to work with your strategy.
//    KEA {

public class MyArray {

  private int[] arrayToSort;

  public int[] getArrayToSort() {
    return arrayToSort;
  }

  public void setArrayToSort(int[] arrayToSort) {
    this.arrayToSort = arrayToSort;
  }

  public void sort(SortingStrategy sortingStrategy){

    sortingStrategy.sort(arrayToSort);
  }

  public static void main(String[] args){
    MyArray myArray = new MyArray();
    myArray.setArrayToSort(new int[] {9,4,6,3,5,7,2,8,1});

    myArray.sort(new BubbleSortStrategy(myArray.getArrayToSort()));
    myArray.sort(new QuickSortStrategy(myArray.getArrayToSort()));
    myArray.sort(new SelectionSortStrategy(myArray.getArrayToSort()));
 }
}
