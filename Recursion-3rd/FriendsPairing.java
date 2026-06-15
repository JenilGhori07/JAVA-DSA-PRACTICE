// Friends Pairing Problem:
// Find the total number of ways n friends can remain single
// or can be paired up using recursion.

public class FriendsPairing {

    public static int CallIn(int n) {

        // Base case: 0 or 1 friend has only one possible arrangement
        if (n <= 1) {
            return 1;
        }

        // Friend stays single
        int Way1 = CallIn(n - 1);

        // Friend pairs up with any of the remaining (n-1) friends
        int Way2 = (n - 1) * CallIn(n - 2);

        // Total ways
        return Way1 + Way2;
    }

    public static void main(String[] args) {

        int n = 4;

        // Print total number of arrangements
        System.out.println(CallIn(n));
    }
}