package Trees;

import java.util.*;
// Q :-> Given a Tree of “N” nodes and N-1 edges ; rooted at node “1” ; print “N” integers ; where the ith integer prints the number of children of the ith node. Once this is done ; print all the leaves of the particular tree. 

public class bfs {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();

    ArrayList<Integer>[] g = new ArrayList[n + 1];
    for (int i = 1; i <= n; i++) {
      g[i] = new ArrayList<>();
    }

    for (int i = 1; i <= n - 1; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      g[x].add(y);
      g[y].add(x);
    }

    Queue<Integer> q = new LinkedList<>();
    int[] used = new int[n + 1];

    used[1] = 1;
    q.offer(1);

    ArrayList<Integer> leaves = new ArrayList<>();

    while (!q.isEmpty()) {
      int node = q.poll();
      int children = 0;

      for (int u : g[node]) {
        if (used[u] == 0) {
          used[u] = 1;
          q.offer(u);
          children++;
        }
      }

      System.out.println(node + " " + children);

      if (children == 0) {
        leaves.add(node);
      }
    }

    System.out.println("Leaves:");
    for (int leaf : leaves) {
      System.out.print(leaf + " ");
    }
  }
}
