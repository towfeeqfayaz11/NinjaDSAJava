/*
Problem statement
You have been given an array/list and a number k. You have to find the kth smallest number.

Example:
Input: ‘N’ = 5 , 'k' = 2
‘A’ = [3, 2, 11, 5, 1]

Output: 2

Explanation: For nums = [3, 2, 11, 5, 1],
In the given array, smallest element is 1 and 2nd smallest element is 2 and the value of k is 2. So, our output will be 2.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 'N', which denotes the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.

The third line contains the value of k.
Output Format :
Return the kth smallest number.
Constraints :
1 <= N <= 10^4
1 <= nums[i] <= 10^9
Time Limit: 1 sec
Sample Input 1:
5
3 2 5 11 1
2
Sample Output 1:
2
Sample Input 2:
7
17 5 14 16 11 18 10
5
Sample Output 2:
16
*/

public class findKthSmallestElement {
    public static int kthSmallest(int[] arr, int n, int k){
        if(k>=n)
            return -1;

        bubbleSort(arr, n);
        return arr[k-1];
    }

    public static void bubbleSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }
}
