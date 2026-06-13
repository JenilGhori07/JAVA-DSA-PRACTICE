// Tower of Hanoi:
// Move all disks from source rod to destination rod
// using a helper rod with recursion.

public class HanoiTower {

    public static void Disk(int n, String src, String helper, String Dest) {

        // Base case: move one disk directly
        if (n == 1) {
            System.out.println("Disk Transfer " + n + " from " + src + " to " + Dest);
            return;
        }

        // Move n-1 disks from source to helper
        Disk(n - 1, src, Dest, helper);

        // Move largest disk to destination
        System.out.println("Disk Transfer " + n + " from " + src + " to " + Dest);

        // Move n-1 disks from helper to destination
        Disk(n - 1, helper, src, Dest);
    }

    public static void main(String[] args) {

        int n = 4;

        // Start Tower of Hanoi process
        Disk(n, "S", "H", "D");
    }
}