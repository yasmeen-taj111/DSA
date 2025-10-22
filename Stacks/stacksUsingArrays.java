package Stacks;

public class basics {
  static int top = -1;
  static int st[];

  static void initialize(int size) {
    st = new int[size];
  }

  static void push(int x) {
    top++;
    st[top] = x;
  }

  static void pop() {
    top--;
  }

  static int topelement() {
    return st[top];
  }

  static int size() {
    return top + 1;
  }

  public static void main(String[] args) {
    initialize(5);
    push(10);
    push(20);
    pop();
    int topel = topelement();
    System.out.println(topel);

  }
}
