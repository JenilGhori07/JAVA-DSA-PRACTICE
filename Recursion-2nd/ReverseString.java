// Reverse String:
// Print a string in reverse order using recursion.

public class ReverseString {

    public static void main(String[] args) {

        String str = "jenil";

        // Start from last character
        PrintRevStr(str.length() - 1, str);
    }

    public static void PrintRevStr(int index, String str) {

        // Base case
        if (index == 0) {
            System.out.print(str.charAt(index));
            return;
        }

        // Print current character
        System.out.print(str.charAt(index));

        // Recursive call for previous character
        PrintRevStr(index - 1, str);
    }
}