package Stacks;

import java.util.Stack;
// 1. FOLLOW the same steps as POSTFIX to INFIX conversion
// 2. Just TRAVERSE the expression from END to START instead of START to END

public class Prefix2Infix {
  private static String prefixtoinfix(String s) {
    Stack<String> st = new Stack<>();
    int n = s.length();
    for (int i = n - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
        st.push(String.valueOf(ch));
      } else {
        if (st.size() >= 2) {
          String t1 = st.pop();
          String t2 = st.pop();
          String ans = '(' + t1 + ch + t2 + ')';
          st.push(ans);
        }

      }
    }
    return st.pop();
  }

  public static void main(String[] args) {
    String ans = prefixtoinfix("*+abc");
    System.out.println(ans);
  }
}
