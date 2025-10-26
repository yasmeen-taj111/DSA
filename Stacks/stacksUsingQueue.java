package Stacks;

import java.util.*;

public class stacksUsingQueue {
  static Queue<Integer> q = new ArrayDeque<>();

  static void push(int x) {
    q.add(x);
    for (int i = 1; i < q.size(); i++) {
      q.add(q.peek());
      q.remove();
    }
    System.out.println(x + " is pushed to the stack");
  }

  static void pop() {
    if (q.isEmpty()) {
      System.out.println("stack is empty");
      return;

    }
    System.out.println(q.peek() + " is popped from stack");
    q.remove();
  }

  static int top() {
    if (q.isEmpty()) {
      System.out.println("stack is empty");
      return -1;
    }
    return q.peek();
  }

  static int size() {
    return q.size();
  }

  public static void main(String[] args) {
    push(10);
    push(20);
    push(30);
    push(40);
    int to = top();
    System.out.println(to + " is the topmost element of stack");
    pop();
    pop();
    int s = size();
    System.out.println(s + " is the size of stack");

  }

}
