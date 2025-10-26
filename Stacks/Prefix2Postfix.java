package Stacks;

import java.util.Stack;
// 1. Scan prefix from right to left
// 2. Push operands to stack
// 3. On operator, pop two elements, combine as operand1 + operand2 + operator, push result back
// 4. At end, stack contains final postfix expression

public class Prefix2Postfix {
  private static String prefixtopostfix(String s) {
    Stack<String> st = new Stack<>();
    int n = s.length();
    for (int i = n - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
        st.push(String.valueOf(ch));
      } else {
        String t1 = st.pop();
        String t2 = st.pop();
        String ans = t1 + t2 + ch;
        st.push(ans);
      }
    }
    return st.pop();
  }

  public static void main(String[] args) {
    String ans = prefixtopostfix("*+AB-CD");
    System.out.println(ans);
  }
}
