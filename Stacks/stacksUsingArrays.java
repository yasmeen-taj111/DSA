package Stacks;

public class stacksUsingArrays {
  static int top = -1;
  static int st[];
  static int s;

  static void initialize(int size) {
    s = size;
    st = new int[size];
  }

  static void push(int x) {
    if (top == s - 1) {
      System.out.println("stack is full,no more push operations");
      return;
    }

    top++;
    st[top] = x;
    System.out.println(x + " pushed to stack");
  }

  static void pop() {
    if (top == -1) {
      System.out.println("stack is empty");
      return;
    }
    System.out.println(st[top] + " is popped from stack");

    top--;
  }

  static int topelement() {
    if (top == -1) {
      System.out.println("stack is empty");
      return -1;
    }
    return st[top];
  }

  static int size() {
    return top + 1;
  }

  public static void main(String[] args) {
    initialize(5);
    push(10);
    push(20);
    push(30);
    push(40);
    push(50);
    push(60);
    pop();
    pop();
    pop();
    pop();
    pop();

    int topel = topelement();
    System.out.println("top element of stack is " + topel);

  }
}
