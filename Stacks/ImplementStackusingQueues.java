package Stacks;

import java.util.*;

//leetcode qs 
// 225. Implement Stack using Queues
public class ImplementStackusingQueues {
  class MyStack {
    Queue<Integer> q = new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
      q.add(x);
      for (int i = 1; i < q.size(); i++) {
        q.add(q.peek());
        q.remove();
      }
    }

    public int pop() {
      int p = q.peek();
      q.remove();
      return p;
    }

    public int top() {
      return q.peek();
    }

    public boolean empty() {
      if (q.isEmpty())
        return true;
      return false;
    }
  }

  /**
   * Your MyStack object will be instantiated and called as such:
   * MyStack obj = new MyStack();
   * obj.push(x);
   * int param_2 = obj.pop();
   * int param_3 = obj.top();
   * boolean param_4 = obj.empty();
   */

}
