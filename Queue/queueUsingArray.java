package Queue;

public class queueUsingArray {
  static int start = -1, end = -1, currsize = 0;
  static int q[];

  static void initialize(int size) {
    q = new int[size];
  }

  static void push(int x) {
    if (currsize == q.length) {
      System.out.println("queue is full,no more push operation");
      return;
    }

    if (currsize == 0) {
      start = end = 0;
    } else {
      end = (end + 1) % q.length;
    }
    q[end] = x;
    System.out.println(x + " is pushed to the queue");
    currsize++;
  }

  static void pop() {
    if (currsize == 0)
      System.out.println("queue is empty");
    System.err.println(q[start] + " is popped from queue");
    start = (start + 1) % q.length;
    currsize--;

  }

  static int top() {
    if (currsize == 0)
      System.out.println("queue is empty");
    return q[start];
  }

  static int size() {
    return currsize;
  }

  public static void main(String[] args) {
    initialize(5);
    push(2);
    push(4);
    push(6);
    push(8);
    push(10);
    push(12);
    pop();
    pop();
    int topel = top();
    System.out.println("top element in queue is " + topel);
    int count = size();
    System.out.println("size of queue is " + count);

  }
}
