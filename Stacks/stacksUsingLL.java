package Stacks;

class Node {
  int data;
  Node next;

  public Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class stacksUsingLL {
  static int size = 0;
  static Node top = null;

  public static void push(int x) {

    Node newn = new Node(x, top);
    System.out.println(x + " is pushed to stacks");
    top = newn;
    size++;

  }

  public static void pop() {
    if (size == 0) {
      System.out.println("stack is empty");
      return;
    }
    Node temp = top;
    top = top.next;
    System.out.println(temp.data + " is popped from stacks");
    size--;

  }

  public static Node peek() {

    return top;
  }

  public static int size() {
    return size;
  }

  public static void main(String[] args) {
    push(10);
    push(20);
    push(30);
    push(50);
    pop();
    Node head = peek();
    if (head != null)
      System.out.println(head.data + " is the top element");

    int s = size();
    System.out.println(s + " is the size of stacks");
    pop();
    pop();
    pop();
    pop();

  }
}
