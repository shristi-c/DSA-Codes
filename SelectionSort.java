import java.util.Arrays;
public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = {3, 5, 1, 8, 2};
    Selection(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void Selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int start = 0;
      int end = arr.length - i - 1;
      int maxIndex = getmaxInd(arr, start, end);
      swap(arr, maxIndex, end);
    }
  }

  static void swap(int[] arr, int f, int s) {
    int temp = arr[f];
    arr[f] = arr[s];
    arr[s] = temp;
  }

  static int getmaxInd(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;
  }
}
