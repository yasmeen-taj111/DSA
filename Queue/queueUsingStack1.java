package Queue;

import java.util.Stack;

public class queueUsingStack1 {
  static Stack<Integer> st1 = new Stack<>();
  static Stack<Integer> st2 = new Stack<>();

  static void push(int x) {
    while (!st1.isEmpty()) {
      st2.push(st1.pop());
    }
    st1.push(x);
    while (!st2.isEmpty()) {
      st1.push(st2.pop());
    }
    System.out.println(x + " is pushed to queue");
  }

  static void pop() {
    if (st1.isEmpty()) {
      System.out.println("queue is empty");
      return;
    }
    System.out.println(st1.pop() + " is popped from queue");
  }

  static int top() {
    if (st1.isEmpty()) {
      System.out.println("queue is empty");
      return -1;
    }
    return st1.peek();
  }

  static int size() {
    return st1.size();
  }

  public static void main(String[] args) {
    push(10);
    push(20);
    push(30);
    int topone = top();
    System.out.println("Top element is: " + topone);
    pop();
    System.out.println("Size of queue: " + size());
  }
}
