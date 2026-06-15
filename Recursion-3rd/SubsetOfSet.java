// Subset of a Set:
// Generate and print all possible subsets of a set using recursion.

import java.util.*;

public class SubsetOfSet {

    // Print the current subset
    public static void PrintResult(ArrayList<Integer> Subset) {

        for (int i = 0; i < Subset.size(); i++) {
            System.out.print(Subset.get(i) + " ");
        }

        System.out.println();
    }

    public static void SubCall(int n, ArrayList<Integer> Subset) {

        // Base case: all elements have been considered
        if (n == 0) {
            PrintResult(Subset);
            return;
        }

        // Include current element in the subset
        Subset.add(n);
        SubCall(n - 1, Subset);

        // Exclude current element from the subset
        Subset.remove(Subset.size() - 1);
        SubCall(n - 1, Subset);
    }

    public static void main(String[] args) {

        int n = 3;

        ArrayList<Integer> Subset = new ArrayList<>();

        // Generate all subsets
        SubCall(n, Subset);
    }
}