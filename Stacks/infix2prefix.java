package Stacks;
// 1. Reverse the input string and swap brackets: '(' becomes ')' and ')' becomes '('

// 2. Convert the modified infix expression to postfix 
//     use strict precedence: push only if current operator has LOWER precedence than stack top (<), not equal except for ^ operator
// 3. Reverse the resulting postfix expression to obtain the final answer

import java.util.Stack;

public class infix2prefix {
  private static String reverse(String a) {
    StringBuilder reverse = new StringBuilder();
    for (int i = a.length() - 1; i >= 0; i--) {
      char ch = a.charAt(i);
      if (ch == '(') {
        reverse.append(')');

      } else if (ch == ')')
        reverse.append('(');
      else {
        reverse.append(ch);
      }
    }
    return reverse.toString();
  }

  private static int prio(char a) {
    if (a == '^')
      return 3;
    else if (a == '*' || a == '/')
      return 2;
    else if (a == '+' || a == '-')
      return 1;
    return 0;
  }

  private static String infixtoprefix(String s) {
    s = reverse(s);
    String ans = "";
    Stack<Character> st = new Stack<>();
    int i = 0, n = s.length();
    while (i < n) {
      if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
          || (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
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
        if (s.charAt(i) == '^') {
          while (!st.isEmpty() && prio(s.charAt(i)) <= prio(st.peek())) {
            ans += st.pop();

          }

        }

        else {
          while (!st.isEmpty() && prio(s.charAt(i)) < prio(st.peek())) {
            ans += st.pop();

          }

        }

        st.push(s.charAt(i));

      }
      i++;

    }
    while (!st.isEmpty()) {
      ans += st.pop();
    }

    return reverse(ans);

  }

  public static void main(String[] args) {
    String an = infixtoprefix("(a+b)*c-d");
    System.out.println(an);

  }

}
