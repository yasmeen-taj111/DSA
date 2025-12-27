package Recursion_Math;

// import java.util.*;

public class prime {
  public static void main(String[] args) {
    int n = 40;
    boolean[] prime = new boolean[n + 1];
    isprime(n, prime);

  }

  public static void isprime(int n, boolean[] prime) {
    if (n <= 1) {
      return;
    }
    for (int i = 2; i * i <= n; i++) {
      if (!prime[i]) {
        for (int j = 2 * i; j <= n; j += i) {
          prime[j] = true;
        }
      }

    }

    for (int i = 2; i < n; i++) {
      if (!prime[i]) {
        System.out.print(i + " ");
      }
    }

  }

}
