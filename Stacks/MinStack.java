package Stacks;

import java.util.Stack;
//leetcode qs no 155

public class MinStack {
  Stack<Long> st = new Stack<>();
  long min;

  public MinStack() {
  }

  public void push(int val) {
    long value = val;
    if (st.isEmpty()) {
      st.push(value);
      min = value;
    } else {
      if (value >= min) {
        st.push(value);
      } else {
        st.push(2 * value - min);
        min = value;
      }
    }
  }

  public void pop() {
    if (st.isEmpty())
      return;
    long x = st.pop();
    if (x < min) {
      min = 2 * min - x;
    }
  }

  public int top() {
    long x = st.peek();
    if (x < min)
      return (int) min;
    return (int) x;
  }

  public int getMin() {
    return (int) min;
  }
}
