package Recursion_Math;

// import java.util.*;

public class Sqrt {

  public static void main(String[] args) {
    int n = 20;
    int p = 3;
    System.err.println(sqrtx(n, p));

  }

  public static double sqrtx(int n, int p) {

    int s = 0;
    int e = n;
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (mid * mid == n) {
        return mid;
      } else if (mid * mid < n) {
        s = mid + 1;

      } else {
        e = mid - 1;
      }

    }
    double root = 0.0;
    double inc = 0.1;
    for (int i = 0; i < p; i++) {
      while (root * root <= n) {
        root += inc;
      }
      root -= inc;
      inc /= 10;

    }

    return root;

  }

}
