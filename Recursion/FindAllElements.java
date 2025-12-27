package Recursion;

import java.util.ArrayList;

public class FindAllElements {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 6, 8, 4, 5, 9, 6, 6, 6, 6, 6, 7 };
    System.out.println(findallindex(arr, 6, list, 0));
    System.out.println(findallindex2(arr, 4, 0));
    findallindex1(arr, 9, 0);
    System.err.println(list2);

  }

  public static ArrayList<Integer> list2 = new ArrayList<>();

  public static void findallindex1(int[] arr, int target, int i) {
    if (i == arr.length) {
      return;
    }
    if (arr[i] == target) {
      list2.add(i);
    }
    findallindex1(arr, target, i + 1);

  }

  public static ArrayList<Integer> findallindex2(int[] arr, int target, int i) {
    ArrayList<Integer> ls2 = new ArrayList<>();
    if (i == arr.length) {
      return ls2;
    }
    if (arr[i] == target) {
      ls2.add(i);
    }
    ArrayList<Integer> listofbelowcalls = findallindex2(arr, target, i + 1);
    ls2.addAll(listofbelowcalls);
    return ls2;
  }

  public static ArrayList<Integer> findallindex(int[] arr, int target, ArrayList<Integer> ls, int i) {
    if (i == arr.length) {
      return ls;
    }
    if (arr[i] == target) {
      ls.add(i);
    }

    return findallindex(arr, target, ls, i + 1);
  }

}
