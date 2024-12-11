/*
Problem statement
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.

'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.

Note:
1. You need to change in the given array/list itself. Hence, no need to return or print anything. 
2. You are not allowed to sort the list/array directly.
Detailed explanation ( Input/output format, Notes, Images )
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
Output Format :
For each test case, print the sorted array/list elements in a row separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2 
Explanation:  The array contains three 0s, two 1s, and two 2s. After sorting the array in a single scan, the 0s should come first, then the 1s, and finally the 2s. So the output is 0 0 0 1 1 2 2.
Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2 
Explanation: The array contains one 0, two 1s, and two 2s. After sorting, the 0 comes first, then the 1s, and finally the 2s. So the output is 0 1 1 2 2.
0 0 0 1 1 2 2
Explanation: The array contains three 0s, two 1s, and two 2s. After sorting, the 0s come first, then the 1s, and finally the 2s. So the output is 0 0 0 1 1 2 2.
*/

/*
Solution 1: brute force
using sorting
T = O(N logN)
S = O(1)
*/
// import java.util.Arrays;
// public class Sort012 {
//     public static void sort012(int[] arr){
//         Arrays.sort(arr);
//     }
// }


/*
Solution 2: optimized
scanning array two times
T = O(2N)
S = O(1)
*/
// class Sort012Two {
//     public static void sort012(int[] arr){
//         int count0=0, count1=0, count2=0;

//         for(int ele: arr){
//             if(ele == 0) count0++;
//             else if(ele == 1) count1++;
//             else count2++;
//         }
//         int ind = 0;
//         for(int i=0; i<count0; i++){
//             arr[ind++] = 0;
//         }

//         for(int i=count0; i<count1; i++){
//             arr[ind++] = 1;
//         }

//         for(int i=0;i<count2;i++){
//             arr[ind++] = 2;
//         }
//     }
// }


/*
Solution 3: optimal
using Dutch National Flag Algorithm
T = O(N)
S = O(1)
*/
public class Sort012Three {
    public static void sort012(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;

        while(mid <=high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
}
