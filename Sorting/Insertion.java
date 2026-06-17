// Insertion Sort:
// Build a sorted array one element at a time by inserting
// each element into its correct position.

public class Insertion {

    public static void PrintArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {7, 8, 3, 1, 2};

        // Time Complexity: O(n²)

        for (int i = 1; i < arr.length; i++) {

            // First element of unsorted part
            int current = arr[i];

            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && current < arr[j]) {

                arr[j + 1] = arr[j];
                j--;
            }

            // Place current element at correct position
            arr[j + 1] = current;
        }

        PrintArray(arr);
    }
}
