// Sorted Array Check:
// Check whether an array is sorted in ascending order using recursion.

public class SortedArray {

    public static boolean FindSort(int index, int arr[]) {

        // Base case: reached last element
        if (index == arr.length - 1) {
            return true;
        }

        // Check current pair and continue recursion
        if (arr[index] < arr[index + 1]) {
            return FindSort(index + 1, arr);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 6};

        // Display result
        System.out.println(FindSort(0, arr));
    }
}