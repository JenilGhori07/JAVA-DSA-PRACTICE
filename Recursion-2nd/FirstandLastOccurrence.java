// First and Last Occurrence:
// Find the first and last position of a character in a string using recursion.

public class FirstandLastOccurrence {

    // Store first and last occurrence positions
    public static int first = -1;
    public static int last = -1;

    public static void main(String[] args) {

        String str = "abaacdaefaah";

        // Find occurrences of character 'a'
        FLoccurence(str, 0, 'a');
    }

    public static void FLoccurence(String str, int index, char element) {

        // Base case: reached end of string
        if (index == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current = str.charAt(index);

        // Update first and last occurrence
        if (current == element) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }

        // Recursive call for next character
        FLoccurence(str, index + 1, element);
    }
}