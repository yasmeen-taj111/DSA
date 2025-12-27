package Recursion;

public class FindElement {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
    System.out.println(find(arr, 8, 0));
    System.err.println(findindex(arr, 8, 0));
  }

  public static boolean find(int[] arr, int target, int i) {
    if (i == arr.length) {
      return false;
    }
    return target == arr[i] || find(arr, target, i + 1);
  }

  public static int findindex(int[] arr, int target, int i) {
    if (i == arr.length) {
      return -1;
    }
    if (target == arr[i]) {
      return i;
    } else {
      return findindex(arr, target, i + 1);
    }
  }
}
