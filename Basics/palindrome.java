class palindrome {
  public static void main(String[] args) {
    int n = 121;
    int ans = 0;
    int t = n;
    while (n > 0) {
      int rem = n % 10;
      n /= 10;
      ans = (ans * 10) + rem;
    }
    if (ans == t)
      System.out.print("true");
    else
      System.out.print("false");

  }
}
