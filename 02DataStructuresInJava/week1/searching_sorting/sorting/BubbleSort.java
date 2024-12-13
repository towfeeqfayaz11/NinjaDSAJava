/*
Bubble Sort
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // for n elements, we need n-1 passes to put elements in correct position
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
