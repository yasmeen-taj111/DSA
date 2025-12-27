public class prime {
  public static void main(String[] args) {
    int n = 16;
    for (int i = 2; i <= (int) Math.sqrt(n); i++) {
      if (n % i == 0) {
        System.out.println("not prime");
        return;
      }

    }
    System.out.println("prime");
  }
}
