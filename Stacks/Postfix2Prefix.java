package Stacks;

import java.util.Stack;
// 1. PUSH all operands into the stack
// 2. WHENEVER an operator is encountered, POP top two elements from the stack
//    and COMBINE them as: (operator + secondTop + top)
// 3. PUSH the new expression back to the stack
// 4. FINALLY, the TOP of the stack will contain the complete PREFIX expression

public class Postfix2Prefix {
  private static String postfixtoprefix(String s) {
    Stack<String> st = new Stack<>();
    int i = 0, n = s.length();
    while (i < n) {
      char ch = s.charAt(i);
      if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
        st.push(String.valueOf(ch));
      } else {
        String t1 = st.pop();
        String t2 = st.pop();
        String ans = ch + t2 + t1;
        st.push(ans);
      }
      i++;
    }
    return st.pop();

  }

  public static void main(String[] args) {
    String ans = postfixtoprefix("AB+CD+*EF/GH+/-");
    System.out.println(ans);
  }
}
