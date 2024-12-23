/*
Intution for insertion sort:
1. Start with the first element: Consider the first element as already sorted.
2. Pick the next element: Take the next element from the unsorted portion.
3. Find the correct position: Compare the picked element with elements in the sorted portion, moving from right to left, to find its correct position.
4. Shift elements: Shift all elements in the sorted portion that are greater than the picked element one position to the right.
5. Insert the element: Insert the picked element into its correct position.
6. Repeat: Repeat the process for all elements until the entire array is sorted.

Time Complexity: O(n^2)
Space Complexity: O(1)

Insertion sort works by dividing the array into two parts; sorted and unsorted, and inserting elements from the unsorted portion
into the sorted portion at the correct position

*/

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // considering element at index 0 is already sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
