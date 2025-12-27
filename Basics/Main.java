// import java.util.*;

// public class Main {
//   public static void main(String[] args) {
//     System.out.println("hello world!!!");
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     if (a > 18) {
//       System.out.println("adult");

//     } else {
//       System.out.println("happy:)");
//     }

//   }
// }

import java.util.*;

public class Main {
  public static void main(String args[]) {
    System.out.println("Hello WORLD:)\n Enter your Number:-");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.println("HELLO");
        break;

      case 2:
        System.out.println("bonjour");
        break;
      case 3:
        System.out.println("Namaste");
        break;
      default:
        System.out.println("invalid");
    }
    sc.close();
  }
}
