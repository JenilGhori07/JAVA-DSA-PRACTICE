// Bubble Sort:
// Repeatedly compare adjacent elements and swap them
// if they are in the wrong order until the array is sorted.

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {7, 8, 3, 1, 2};

        // Perform Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {

            // Compare adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Swap if left element is greater
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
