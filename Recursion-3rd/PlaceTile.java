// Tiling Problem:
// Find the number of ways to place tiles of size 1 × m
// on a floor of size n × m using recursion.

public class PlaceTile {

    public static int PlaceTile(int n, int m) {

        // If floor length equals tile length
        if (n == m) {
            return 2;
        }

        // If floor length is smaller than tile length
        if (n < m) {
            return 1;
        }

        // Place tile vertically
        int Vertical = PlaceTile(n - m, m);

        // Place tile horizontally
        int Horizontal = PlaceTile(n - 1, m);

        // Total ways
        return Vertical + Horizontal;
    }

    public static void main(String[] args) {

        int n = 4, m = 2;

        // Print total number of ways
        System.out.println(PlaceTile(n, m));
    }
}