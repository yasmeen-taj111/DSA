public class divisors {
  public static void main(String[] args) {
    int n = 36;
    for (int i = 1; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println(i);
        if (i != n / i)
          System.out.println(n / i);
      }

    }
  }
}
