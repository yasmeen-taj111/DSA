package Recursion;

public class NumberofZeroes {
  public static void main(String[] args) {
    System.out.println(countzeroes(2000006));
  }

  public static int countzeroes(int n) {
    return help(n, 0);
  }

  public static int help(int n, int c) {
    if (n == 0) {
      return c;
    }
    int rem = n % 10;
    if (rem == 0) {
      return help(n / 10, c + 1);
    }
    return help(n / 10, c);
  }
}
