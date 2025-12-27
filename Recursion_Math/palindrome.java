package Recursion_Math;

public class palindrome {
  static int sum = 0;

  public static void rev(int n) {
    if (n == 0) {
      return;
    }
    int rem = n % 10;
    sum = (sum * 10) + rem;
    rev(n / 10);
  }

  public static boolean palind(int n) {
    sum = 0;
    rev(n);
    return n == sum;
  }

  public static void main(String[] args) {
    int n = 9098;
    System.out.println(palind(n));
  }
}
