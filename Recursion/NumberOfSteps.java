
// import java.util.*;

package Recursion;

class NumberOfSteps {
  public static void main(String[] args) {
    System.out.println(help(8, 0));
  }

  public static int help(int n, int c) {
    if (n == 0) {
      return c;
    }
    if (n % 2 == 0) {
      return help(n / 2, c + 1);
    }
    return help(n - 1, c + 1);
  }
}