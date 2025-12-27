public class NewtonRaphson {
  public static void main(String[] args) {
    double n = 10;
    double tol = 0.01;
    double root;
    double x = n;
    while (true) {
      root = 0.5 * (x + (n / x));
      double ans = x - root;
      if (ans < tol) {
        break;
      }
      x = root;
    }
    System.out.println((int) root);
  }
}
