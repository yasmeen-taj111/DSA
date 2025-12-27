package Recursion;

public class Sorted {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2 };
    System.err.println(sorted(arr, 0));
  }

  public static boolean sorted(int[] arr, int c) {
    if (c == arr.length - 1) {
      return true;
    }
    return arr[c] < arr[c + 1] && sorted(arr, c + 1);
  }

}
