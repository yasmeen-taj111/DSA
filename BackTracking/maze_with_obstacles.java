package BackTracking;

public class maze_with_obstacles {
  public static void main(String[] args) {
    boolean[][] board = {

        { true, true, true },
        { true, true, true },
        { true, true, true }

    };

    maze_with_all_directions(" ", board, 0, 0);

  }

  public static void maze_ob(String p, boolean[][] maze, int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }

    if (!maze[r][c]) {
      return;
    }

    if (r < maze.length - 1) {
      maze_ob(p + "D", maze, r + 1, c);
    }

    if (c < maze[0].length - 1) {
      maze_ob(p + "R", maze, r, c + 1);
    }
  }

  public static void maze_with_all_directions(String p, boolean[][] maze, int r, int c) {
    if (r == maze.length - 1 && c == maze[0].length - 1) {
      System.out.println(p);
      return;
    }
    if (!maze[r][c]) {
      return;
    }
    maze[r][c] = false;

    if (r > 0) {
      maze_with_all_directions(p + "U", maze, r - 1, c);
    }

    if (c > 0) {
      maze_with_all_directions(p + "L", maze, r, c - 1);
    }

    if (r < maze.length - 1) {
      maze_with_all_directions(p + "D", maze, r + 1, c);
    }

    if (c < maze[0].length - 1) {
      maze_with_all_directions(p + "R", maze, r, c + 1);
    }

    maze[r][c] = true;

  }

}
