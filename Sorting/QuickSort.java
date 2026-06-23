// Quick Sort:
// Sort an array using the Divide and Conquer technique by selecting
// a pivot element and placing smaller elements on the left and
// larger elements on the right.


public class QuickSort {

    // Partition the array and place the pivot at its correct position
    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        // Place smaller elements before the pivot
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at its correct position
        i++;

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        // Return pivot index
        return i;
    }

    // Recursively sort left and right subarrays
    public static void Sort(int arr[], int low, int high) {

        // Base case
        if (low < high) {

            // Find pivot position
            int pivot = partition(arr, low, high);

            // Sort left subarray
            Sort(arr, low, pivot - 1);

            // Sort right subarray
            Sort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        int n = arr.length;

        // Start Quick Sort
        Sort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}


//Time Complexity

//Worst : O(n^2)   // Worst case occurs when pivot is always the smallest or the largest element.
//Average : O(nlogn)
