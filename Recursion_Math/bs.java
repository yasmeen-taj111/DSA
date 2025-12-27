package Recursion_Math;

// import java.util.*;

public class bs {
  public static void main(String[] args) {
    int n = 40;
    for (int i = 0; i < n; i++) {
      System.out.println(i + " " + primeNum(i));
    }

  }

  public static boolean primeNum(int n) {
    int i = 2;
    while (i * i <= n) {
      if (n % i == 0) {
        return false;

      }
      i++;

    }
    return true;
  }
}