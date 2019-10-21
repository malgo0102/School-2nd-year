public class MergeSortStrategy extends SortingStrategy {
  private int[] arr;
  private int n;

  public MergeSortStrategy(int[] array, int n){
    this.arr = array;
    this.n = n;
  }

  @Override
  public void sort(int[] a, int n) {

    if (n < 2) {
      return;
    }
    int mid = n / 2;
    int[] l = new int[mid];
    int[] r = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      l[i] = a[i];
    }
    for (int i = mid; i < n; i++) {
      r[i - mid] = a[i];
    }
    sort(l, mid);
    sort(r, n - mid);

    merge(a, l, r, mid, n - mid);

    for(int k=0; k<arr.length; k++){
      System.out.print(arr[k]+" ");
    }
    System.out.println(" sorted with Merge Sort strategy");
  }

  public static void merge(
      int[] a, int[] l, int[] r, int left, int right) {

    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
      if (l[i] <= r[j]) {
        a[k++] = l[i++];
      }
      else {
        a[k++] = r[j++];
      }
    }
    while (i < left) {
      a[k++] = l[i++];
    }
    while (j < right) {
      a[k++] = r[j++];
    }
  }
}
