package Queue;

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

public class queueUsingLL {
  static int c = 0;
  static Node start = null, end = null;

  static void push(int x) {
    Node newn = new Node(x);
    if (start == null) {

      start = end = newn;

    } else {

      end.next = newn;
      end = newn;

    }
    c++;
    System.out.println(newn.data + " is pushed to queue");

  }

  static void pop() {
    if (c == 0) {
      System.out.println("queue is empty");
      return;
    }
    Node temp = start;
    start = start.next;
    if (start == null)
      end = null;
    System.out.println(temp.data + " is popped from queue");
    c--;

  }

  static Node top() {
    return start;
  }

  static int size() {
    return c;
  }

  public static void main(String[] args) {
    push(10);
    push(20);
    pop();
    push(30);
    push(60);
    Node to = top();
    if (to != null) {
      System.out.println(to.data + " is top element in queue");
    }

    int s = size();
    System.out.println("the size of queue is " + s);

  }

}
