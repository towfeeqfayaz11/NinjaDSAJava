

/*
Time Complexity: O(N)
Space Complexity: O(1)
*/
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 9, 5};
        int key = 7;
        int index = linearSearch(arr, key);
        System.out.println("Index of " + key + " is: " + index);
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
}
