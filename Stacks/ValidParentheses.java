package Stacks;

import java.util.Stack;

public class ValidParentheses {
  // leetcode qs no 20 Valid Parentheses
  // approach 1
  class Solution {
    public boolean isValid(String s) {
      Stack<Character> st = new Stack<>();
      for (char i : s.toCharArray()) {
        if (i == '(' || i == '{' || i == '[')
          st.push(i);
        else {
          if (st.isEmpty())
            return false;
          char ch = st.peek();
          if ((ch == '(' && i == ')') || (ch == '{' && i == '}') || (ch == '[' && i == ']')) {
            st.pop();
          } else {
            return false;
          }

        }
      }
      return st.isEmpty();
    }
  }

  // approach 2
  class Solution2 {
    public boolean isValid(String s) {
      Stack<Character> st = new Stack();
      for (char c : s.toCharArray()) {
        if (c == '{') {
          st.push('}');
        } else if (c == '[') {
          st.push(']');
        } else if (c == '(') {
          st.push(')');
        } else if (st.isEmpty() || st.pop() != c) {
          return false;
        }
      }
      return st.isEmpty();

    }
  }

}
