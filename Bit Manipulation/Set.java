// Set Bit: It is used to change a bit at a specific position to 1.

public class Set {
    public static void main(String[] args) {

        int n = 5; // Binary: 0101
        int i = 1; // Position where bit needs to be set

        // Create a bitmask with 1 at position i
        int Bitmask = 1 << i;

        // Set the bit using OR operator
        int NewNum = Bitmask | n;

        System.out.println(NewNum); // 7 (Decimal) -> 0111 (Binary)
    }
}