// String Permutations:
// Generate and print all possible arrangements of characters
// in a string using recursion.

public class PermutationsOfString {

    public static void PrintPerm(String str, String Permutation) {

        // Base case: permutation is complete
        if (str.length() == 0) {
            System.out.println(Permutation);
            return;
        }

        // Select each character one by one
        for (int i = 0; i < str.length(); i++) {

            char Current = str.charAt(i);

            // Create a new string by removing the selected character
            String Newstr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call for remaining characters
            PrintPerm(Newstr, Permutation + Current);
        }
    }

    public static void main(String[] args) {

        String str = "ABC";

        // Generate all permutations of the string
        PrintPerm(str, "");
    }
}
