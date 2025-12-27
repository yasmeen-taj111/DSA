package BackTracking;

import java.util.ArrayList;

public class maze {
  public static void main(String[] args) {
    System.out.println(count(3, 3));
    path(" ", 3, 3);
    System.out.println(pathdiaarray("", 3, 3));

  }

  public static int count(int r, int c) {
    if (r == 1 || c == 1) {
      return 1;
    }
    int left = count(r - 1, c);
    int right = count(r, c - 1);
    return left + right;
  }

  public static void path(String p, int r, int c) {
    if (c == 1 && r == 1) {
      System.out.println(p);
    }
    if (r > 1) {
      path(p + "d", r - 1, c);
    }
    if (c > 1) {
      path(p + "r", r, c - 1);
    }
  }

  // using arraylist
  public static ArrayList<String> patharray(String p, int r, int c) {
    if (r == 1 && c == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> list = new ArrayList<>();

    if (r > 1) {
      list.addAll(patharray(p + "D", r - 1, c));
    }
    if (c > 1) {
      list.addAll(patharray(p + "R", r, c - 1));
    }
    return list;
  }

  // if diagonal is included
  public static ArrayList<String> pathdiaarray(String p, int r, int c) {
    if (r == 1 && c == 1) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    ArrayList<String> list = new ArrayList<>();
    if (r > 1 && c > 1) {
      list.addAll(pathdiaarray(p + "D", r - 1, c - 1));
    }

    if (r > 1) {
      list.addAll(pathdiaarray(p + "H", r - 1, c));
    }
    if (c > 1) {
      list.addAll(pathdiaarray(p + "V", r, c - 1));
    }
    return list;
  }

}
