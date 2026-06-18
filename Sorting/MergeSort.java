// Merge Sort:
// Divide the array into smaller parts, sort them recursively,
// and then merge the sorted parts to get the final sorted array.

public class MergeSort {

    // Merge two sorted subarrays
    public static void Conquer(int arr[], int si, int mid, int ei) {

        int Merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Compare elements and merge in sorted order
        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                Merged[x++] = arr[idx1++];
            } else {
                Merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left subarray
        while (idx1 <= mid) {
            Merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from right subarray
        while (idx2 <= ei) {
            Merged[x++] = arr[idx2++];
        }

        // Copy merged elements back to original array
        for (int i = 0, j = si; i < Merged.length; i++, j++) {
            arr[j] = Merged[i];
        }
    }

    // Divide the array into smaller subarrays
    public static void Divide(int arr[], int si, int ei) {

        // Base case: single element is already sorted
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Sort left half
        Divide(arr, si, mid);

        // Sort right half
        Divide(arr, mid + 1, ei);

        // Merge both sorted halves
        Conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        int n = arr.length;

        // Start Merge Sort
        Divide(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
