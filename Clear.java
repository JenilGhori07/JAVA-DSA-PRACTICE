// Clear Bit: It is used to change a bit at a specific position to 0.

public class Clear {
    public static void main(String[] args) {

        int n = 5; // Binary: 0101
        int i = 2; // Position of bit to clear

        // Create a bitmask with 1 at position i
        int Bitmask = 1 << i;

        // Invert the bitmask (1 becomes 0, others become 1)
        int Not = ~Bitmask;

        // Clear the bit using AND operator
        int result = Not & n;

        System.out.println(result);
    }
}
