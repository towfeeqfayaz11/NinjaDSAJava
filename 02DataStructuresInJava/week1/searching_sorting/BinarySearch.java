/*
Prerequisite for binary search is that the array should be sorted.

Time Complexity: O(logN)
Space Complexity: O(1)
*/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 5;
        int index = binarySearch(arr, key);
        System.out.println("Index of " + key + " is: " + index);
    }

    public static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}
