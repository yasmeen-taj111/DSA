package Stacks;

import java.util.*;

public class infix2postfix {

  private static int prio(char a) {
    if (a == '^')
      return 3;
    else if (a == '*' || a == '/')
      return 2;
    else if (a == '+' || a == '-')
      return 1;
    return 0;

  }

  private static String infixtopostfix(String s) {

    Stack<Character> st = new Stack<>();
    String ans = "";
    int i = 0;
    int n = s.length();
    while (i < n) {
      if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
          || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        ans += s.charAt(i);
      } else if (s.charAt(i) == '(') {
        st.push(s.charAt(i));
      } else if (s.charAt(i) == ')') {
        while (!st.isEmpty() && st.peek() != '(') {
          ans += st.pop();
        }
        if (!st.isEmpty() && st.peek() == '(')
          st.pop();

      } else {
        while (!st.isEmpty() && prio(s.charAt(i)) <= prio(st.peek())) {
          ans += st.pop();
        }
        st.push(s.charAt(i));
      }
      i++;

    }
    while (!st.isEmpty()) {
      ans += st.pop();
    }
    return ans;

  }

  public static void main(String[] args) {
    String an = infixtopostfix("(a+b)*c-d");
    System.out.println(an);
  }
}
