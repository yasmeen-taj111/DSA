package Stacks;

import java.util.ArrayList;
import java.util.List;

public class NGEatRight {
  // Number of Greater Elements to the Right

  private static List<Integer> count_NGE(int[] arr, int[] indices) {
    int c = 0;
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < indices.length; i++) {
      int index = indices[i];
      c = 0;
      for (int j = index + 1; j < arr.length; j++) {
        if (arr[index] < arr[j])
          c++;

      }
      ans.add(c);

    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 4, 2, 7, 5, 8, 10, 6 };
    int[] indices = { 0, 5 };
    List<Integer> ans = count_NGE(arr, indices);
    System.out.println(ans);

  }
}
