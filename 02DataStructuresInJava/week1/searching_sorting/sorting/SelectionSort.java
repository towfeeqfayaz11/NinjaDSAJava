/*
Intution for selection sort:
1. Find the minimum element in the array and swap it with the element at the beginning of the array.
2. Repeat the above process for the remaining elements of the array.
3. Time Complexity: O(n^2)
4. Space Complexity: O(1)

ideal to use when input is very small and simple
*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1}; 
        selectionSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
