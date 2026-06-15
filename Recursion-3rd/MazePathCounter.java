// Maze Path Counting:
// Find the total number of paths from the starting cell to the destination
// in a maze using recursion. Movement is allowed only to the right or down.

public class MazePathCounter {

    public static int Counter(int i, int j, int n, int m) {

        // Out of bounds
        if (i == n || j == m) {
            return 0;
        }

        // Destination reached
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // Move down
        int Right = Counter(i + 1, j, n, m);

        // Move right
        int Down = Counter(i, j + 1, n, m);

        // Total paths
        return Right + Down;
    }

    public static void main(String[] args) {

        int n = 3, m = 3;

        // Count total paths from (0,0) to (n-1,m-1)
        int TotalPaths = Counter(0, 0, n, m);

        System.out.println(TotalPaths);
    }
}