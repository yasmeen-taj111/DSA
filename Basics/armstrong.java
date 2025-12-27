class armstrong {
  public static void main(String[] args) {
    int n = 153;
    double ans = 0;
    int t = n;
    while (n > 0) {
      int rem = n % 10;
      n /= 10;
      ans += Math.pow(rem, 3);

    }
    if (ans == t) {
      System.out.print("TRUE");
    } else {
      System.out.print("false");
    }

  }
}
