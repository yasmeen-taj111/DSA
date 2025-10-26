package Stacks;

import java.util.Stack;
// 1. PUSH all operands into the stack
// 2. WHENEVER an operator is encountered, POP top two elements from the stack
//    and COMBINE them as: (secondTop operator top)
// 3. PUSH the new expression back to stack
// 4. FINALLY, the TOP of the stack will contain the complete INFIX expression

public class Postfix2Infix {
  private static String postfixtoinfix(String s) {
    Stack<String> st = new Stack<>();
    int i = 0, n = s.length();
    while (i < n) {
      char ch = s.charAt(i);
      if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {

        st.push(String.valueOf(ch));
      } else {

        String t1 = st.peek();
        st.pop();
        String t2 = st.peek();
        st.pop();
        String ans = "(" + t2 + ch + t1 + ")";
        st.push(ans);

      }
      i++;
    }
    return st.peek();
  }

  public static void main(String[] args) {
    String ans = postfixtoinfix("abc*+");
    System.out.println(ans);
  }
}
