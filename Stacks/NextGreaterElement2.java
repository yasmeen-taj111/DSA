package Stacks;

import java.util.Stack;

public class NextGreaterElement2 {
  // nge for circular array
  private static int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    Stack<Integer> st = new Stack<>();
    int[] nge = new int[n];
    int x = (2 * n - 1);
    for (int i = x; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() <= nums[i % n])
        st.pop();
      if (i < n) {
        if (st.isEmpty())
          nge[i] = -1;
        else
          nge[i] = st.peek();
      }

      st.push(nums[i % n]);
    }
    return nge;
  }

  public static void main(String[] args) {
    int a[] = { 1, 7, 9, 2, 3, 5, 6, 2 };
    int ans[] = nextGreaterElements(a);
    for (int i = 0; i < a.length; i++) {
      System.out.println(ans[i]);
    }
  }
}
