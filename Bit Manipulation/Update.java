// Update Bit: It is used to change a bit at a specific position
// to either 0 or 1 as required.

public class Update {
    public static void main(String[] args) {

        // 1. Update bit to 0 (Clear Bit)

        int n = 5; // Binary: 0101
        int i = 2; // Position to update

        // Create a bitmask with 1 at position i
        int Bitmask = 1 << i;

        // Invert the bitmask and clear the bit
        int Not = ~Bitmask;
        int result = Not & n;

        System.out.println(result);

        // 2. Update bit to 1 (Set Bit)

        int m = 5; // Binary: 0101
        int j = 2; // Position to update

        // Create a bitmask with 1 at position j
        int BitMask = 1 << j;

        // Set the bit using OR operator
        int NewNum = BitMask | m;

        System.out.println(NewNum);
    }
}
