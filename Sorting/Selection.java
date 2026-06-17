// Selection Sort:
// Repeatedly find the smallest element from the unsorted part
// and place it at the correct position.

public class Selection {

    public static void PrintArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 3, 1, 2};

        // Time Complexity: O(n²)

        for (int i = 0; i < arr.length - 1; i++) {

            // Assume current index contains the smallest element
            int small = i;

            // Find the actual smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[small] > arr[j]) {
                    small = j;
                }
            }

            // Swap smallest element with current position
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

        PrintArray(arr);
    }
}
