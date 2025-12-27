package Recursion_Math;

import java.util.*;

public class factors {
  public static void main(String[] args) {
    int n = 20;
    factor1(n);
    factor2(n);
    factor3(n);
  }

  public static void factor1(int n) {
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.print(i + " ");
      }

    }
    System.out.println(" ");
  }

  public static void factor2(int n) {
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.print(i + " " + n / i + " ");
      }

    }
    System.out.println(" ");
  }

  public static void factor3(int n) {
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        if (n / i == i) {
          System.out.print(i + " ");
        } else {
          System.out.print(i + " ");
          al.add(n / i);
        }
      }
    }
    for (int i = al.size() - 1; i >= 0; i--) {
      System.out.print(al.get(i) + " ");
    }

  }
}
