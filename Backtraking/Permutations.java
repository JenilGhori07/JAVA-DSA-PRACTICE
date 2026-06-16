// String Permutations:
// Generate and print all possible arrangements of characters
// in a string using recursion.

public class Permutations {

    public static void PrintPerm(String str, String Permutations, int idx) {

        // Base case: permutation is complete
        if (str.length() == 0) {
            System.out.println(Permutations);
            return;
        }

        // Choose each character one by one
        for (int i = 0; i < str.length(); i++) {

            char Current = str.charAt(i);

            // Remove the selected character from the string
            String NewStr = str.substring(0, i) + str.substring(i + 1);

            // Recursive call for remaining characters
            PrintPerm(NewStr, Permutations + Current, idx);
        }
    }

    public static void main(String[] args) {

        String str = "ABC";

        // Generate all permutations
        PrintPerm(str, "", 0);
    }
}