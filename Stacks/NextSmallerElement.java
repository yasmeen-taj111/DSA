package Stacks;

import java.util.Stack;

public class NextSmallerElement {

  private static int[] nextSmallerElements(int[] arr) {
    // Your code goes here
    int n = arr.length;
    Stack<Integer> st = new Stack<>();
    int[] nge = new int[n];
    for (int i = n - 1; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() >= arr[i])
        st.pop();
      if (st.isEmpty())
        nge[i] = -1;
      else
        nge[i] = st.peek();
      st.push(arr[i]);

    }

    return nge;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 8, 5, 2, 25 };
    int[] ans = nextSmallerElements(arr);
    for (int i = 0; i < ans.length; i++)
      System.out.println(ans[i]);
  }
}
