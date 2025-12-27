import java.util.Arrays;

public class sieve {
  public static void main(String[] args) {
    int n = 40;
    boolean[] primes = new boolean[n + 1];
    Arrays.fill(primes, true);
    primes[0] = primes[1] = false;
    int i = 2;
    while (i * i <= n) {
      if (primes[i]) {
        for (int j = i * i; j <= n; j += i) {
          primes[j] = false;
        }
      }
      i++;
    }
    for (i = 2; i <= n; i++) {
      if (primes[i]) {
        System.out.print(i + " ");
      }

    }
  }
}
