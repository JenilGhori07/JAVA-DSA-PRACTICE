// Get Bit: It is used to check whether a bit at a specific position
// in a binary number is 0 or 1.

public class Get {
    public static void main(String[] args) {

        int num = 5; // Binary: 0101
        int i = 3;   // Position of the bit to check

        // Create a bitmask with 1 at position i
        int Bitmask = 1 << i;

        // Check whether the bit at position i is 0 or 1
        if ((Bitmask & num) == 0) {
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }
    }
}