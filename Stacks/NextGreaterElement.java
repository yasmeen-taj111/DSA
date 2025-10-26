package Stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
  private static int[] nge(int[] a) {
    int n = a.length;
    Stack<Integer> st = new Stack<>();
    int[] nge = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() <= a[i])
        st.pop();
      if (st.isEmpty())
        nge[i] = -1;
      else
        nge[i] = st.peek();
      st.push(a[i]);

    }

    return nge;
  }
  // nge -> with 2 array parameter
  // we have to use a hashmap to store the results

  private static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    int n = nums1.length;
    int n2 = nums2.length;
    Map<Integer, Integer> ngemap = new HashMap<>();
    Stack<Integer> st = new Stack<>();
    for (int i = n2 - 1; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() <= nums2[i])
        st.pop();
      if (st.isEmpty())
        ngemap.put(nums2[i], -1);
      else
        ngemap.put(nums2[i], st.peek());
      st.push(nums2[i]);
    }
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      ans[i] = ngemap.get(nums1[i]);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] a = { 1, 3, 9, 8, 4, 6, 9 };
    int[] b = { 6, 1, 7, 3, 9, 9, 6, 4, 8, 12, 10 };
    int[] arr = nextGreaterElement2(a, b);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

  }
}
