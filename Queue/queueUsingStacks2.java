package Queue;

import java.util.Stack;

public class queueUsingStacks2 {
  static Stack<Integer> st1 = new Stack<>();
  static Stack<Integer> st2 = new Stack<>();

  static void push(int x) {
    st1.push(x);
    System.out.println(x + " is pushed to the queue");
  }

  static void pop() {
    if (st1.isEmpty() && st2.isEmpty()) {
      System.out.println("queue is empty,cannot pop");
      return;
    }
    if (st2.size() != 0) {
      System.out.println(st2.peek() + " is popped from the queue");
      st2.pop();
      return;

    } else {
      while (st1.size() != 0) {
        st2.push(st1.peek());
        st1.pop();
      }

      System.out.println(st2.peek() + " is popped from the queue");
      st2.pop();
    }

  }

  static int top() {
    if (st1.isEmpty() && st2.isEmpty()) {
      System.out.println("queue is empty");
      return -1;
    }
    if (st2.size() != 0) {
      return st2.peek();

    } else {
      while (st1.size() != 0) {
        st2.push(st1.peek());
        st1.pop();
      }
      return st2.peek();
    }
  }

  static int size() {
    return st1.size() + st2.size();

  }

  public static void main(String[] args) {
    push(10);
    push(20);
    push(30);
    int to = top();
    System.out.println(to + " is the top most element in the queue");
    int s = size();
    System.out.println(s + " is the size of the queue");
    pop();
  }

}
